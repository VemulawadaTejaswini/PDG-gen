import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("D:\\UserArea\\J0124567\\Downloads\\2010-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0)
				break;
			Map mp = new Map(n, m);
			for (int i = 0; i < m; i++)
				mp.addRoot(scan.nextInt(), scan.nextInt(), scan.nextInt());
			int l = scan.nextInt();
			mp.ml(l);
			for (int i = 0; i < l; i++)
				mp.addMail(i, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.next());
			mp.process();
		}

		scan.close();
		System.exit(0);
	}
}

class Map {
	class Evt {
		public Evt(int tm, int fr) {
			time = tm;
			pof = fr;
		}

		int time;
		int pof;
	}

	class EvTime implements Comparator<Evt> {

		@Override
		public int compare(Evt o1, Evt o2) {
			if (o1.time > o2.time)
				return 1;
			else if (o1.time == o2.time)
				if (o1.pof > o2.pof)
					return 1;
				else if (o1.pof == o2.pof)
					return 0;
				else
					return -1;
			else
				return -1;
		}
	}

	PriorityQueue<Evt> evt = new PriorityQueue<Evt>(100, new EvTime());

	int N;
	int[] delv;
	int[][] dist;
	int[][] next;

	class Mail {
		public Mail(int tm, String lb) {
			arrive = tm;
			lab=new String(lb);
		}

		int arrive;
		String lab;
	}

	List<Mail> mail = new ArrayList<Mail>();
	int[] p_fr;
	int[] p_to;
	int[] p_nx;
	int[] time;
	String[] label;

	public Map(int n, int m) {
		N = n;
		delv = new int[n + 1];
		dist = new int[n + 1][n + 1];
		next = new int[n + 1][n + 1];

	}

	public void ml(int l) {
		p_fr = new int[l];
		p_to = new int[l];
		p_nx = new int[l];
		time = new int[l];
		label = new String[l];		
	}

	public void process() {
		Evt e;
		while ((e = evt.poll()) != null) {
			if (delv[e.pof] > e.time)
				continue;
			int minTo = Integer.MAX_VALUE;
			int minTm = Integer.MAX_VALUE;
			int mail = 0;
			for (int i = 0; i < p_fr.length; i++)
				if (p_fr[i] == e.pof && (time[i] < minTm || (time[i] == minTm) && p_nx[i] < minTo)) {
					minTo = p_nx[i];
					minTm = time[i];
					mail = i;
				}

			if (minTm != Integer.MAX_VALUE)
				this.deriver(mail, e.time);

			for (int i = 0; i < p_fr.length; i++)
				if (i != mail && p_fr[i] == e.pof && p_nx[i] == minTo && time[i] <= e.time)
					this.deriver(i, e.time);
		}

		this.printMail();

	}

	class mailSort implements Comparator<Mail> {

		@Override
		public int compare(Mail o1, Mail o2) {
			if (o1.arrive > o2.arrive)
				return 1;
			else if (o1.arrive == o2.arrive)
				if (o1.lab.compareTo(o2.lab) > 0)
					return 1;
				else if (o1.lab.compareTo(o2.lab) == 0)
					return 0;
				else
					return -1;
			else
				return -1;
		}

	}

	private void printMail() {
		// for (int i = 0; i < p_fr.length; i++) {
		for (int i = 0; i < p_fr.length; i++) {
			mail.add(new Mail(time[i], label[i]));
		}
		Collections.sort(mail, new mailSort());
		for (int i = 0; i < mail.size(); i++)
			System.out.println(mail.get(i).lab + " " + mail.get(i).arrive);

	}

	private void deriver(int m, int tm) {
		if (p_nx[m] == p_fr[m]) {
			// System.out.println(label[m] + " " + time[m]);
			p_fr[m] = -1;
			return;
		}
		delv[p_fr[m]] = tm + (dist[p_fr[m]][p_nx[m]] * 2);
		evt.add(new Evt(delv[p_fr[m]], p_fr[m]));

		time[m] = tm + dist[p_fr[m]][p_nx[m]];
		p_fr[m] = p_nx[m];
		p_nx[m] = this.getNext(p_fr[m], p_to[m]);
		evt.add(new Evt(time[m], p_fr[m]));

	}

	public void addMail(int id, int fr, int to, int tm, String lab) {
		p_fr[id] = fr;
		p_to[id] = to;
		time[id] = tm;
		label[id] = lab.substring(0);

		p_nx[id] = this.getNext(fr, to);
		// System.out.println("send to - " + p_nx[id]);
		evt.add(new Evt(tm, fr));
	}

	private int getNext(int fr, int to) {
		if (fr == to)
			return to;
		if (next[fr][to] > 0)
			return next[fr][to];

		int min = Integer.MAX_VALUE;
		int nx = 0;
		for (int i = 1; i < next.length; i++) {
			int[] r = new int[dist.length];
			if (dist[fr][i] > 0) {
				int d = this.leastDist(fr, to, i, r);
				if (d < min) {
					min = d;
					nx = i;
				}
			}
		}
		next[fr][to] = nx;
		return nx;
	}

	private int leastDist(int fr, int to, int nx, int[] r) {
		if (fr == to)
			return 0;
		if (nx == to)
			return dist[fr][nx];
		r[fr] = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < dist.length; i++)
			if (dist[nx][i] > 0 && r[i] == 0) {
				int d = leastDist(nx, to, i, r);
				if (d > 0 && d + dist[fr][nx] < min)
					min = d + dist[fr][nx];
			}
		r[fr] = 0;
		if (min == Integer.MAX_VALUE)
			return -1;
		else
			return min;
	}

	public void addRoot(int fr, int to, int ds) {
		dist[fr][to] = ds;
		dist[to][fr] = ds;
	}
}