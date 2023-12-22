import java.util.ArrayDeque;
import java.util.Scanner;


public class Main {

	static class MyProcess {

		String qName;
		int needTime;
		int finTime = 0;

		public int getFinTime() {
			return finTime;
		}

		public String getqName() {
			return qName;
		}

		public int getNeedTime() {
			return needTime;
		}

		public void setNeedTime(int needTime) {
			this.needTime = needTime;
		}

		public void setFinTime(int finTime) {
			this.finTime = finTime;
		}

		MyProcess(String qName, int needTime, int finTime) {
			this.qName = qName;
			this.needTime = needTime;
			this.finTime = finTime;

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), qTime = sc.nextInt();
		int totalTime = 0;

		MyProcess[] mps = new MyProcess[n];

		for (int i = 0; i < n; i++) {
			mps[i] = new MyProcess(sc.next(), sc.nextInt(), 0);
		}

		java.util.Queue<MyProcess> q = new ArrayDeque<MyProcess>();
		for (int i = 0; i < n; i++) {
			q.add(mps[i]);
		}

		while (q.peek() != null) {
			MyProcess mp = q.poll();
			int needTime = mp.getNeedTime();
			String pName = mp.getqName();
			if (needTime <= qTime) {
				totalTime += needTime;
				mp.setFinTime(totalTime);
				System.out.println(mp.getqName() +" "+ mp.getFinTime());
			} else {
				q.add(new MyProcess(pName, needTime - qTime, 0));
				totalTime += qTime;
			}
		}
	}


}

