import java.util.*;
import java.io.PrintWriter;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] S = new int[N];
		int[] T = new int[N];
		int[] X = new int[N];
		int[] D = new int[Q];
		PrintWriter out = new PrintWriter(System.out);
		Comparator<Event> comparator = new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return Integer.valueOf(o1.t).compareTo(Integer.valueOf(o2.t));
            }
        };
		List<Event> event = new ArrayList<Event>();
		for (int i=0;i<N;i++) {
			S[i]=Integer.parseInt(sc.next());
			T[i]=Integer.parseInt(sc.next());
			X[i]=Integer.parseInt(sc.next());
			Event add_event = new Event(S[i]-X[i],1,X[i]);
			Event remove_event = new Event(T[i]-X[i],-1,X[i]);
			event.add(add_event);
			event.add(remove_event);
		}
		for (int i=0;i<Q;i++) {
			D[i]=sc.nextInt();
		}
		Collections.sort(event,comparator);
		TreeSet<Integer> set = new TreeSet<Integer>();
		int time=0;
		int w=0;
		loop:while (!event.isEmpty()) {
			Event tmp = event.remove(0);
			time=tmp.t;
			while (D[w]<time) {
				if (set.isEmpty()) {
					out.println(-1);
				} else {
					out.println(set.first());
				}
				w++;
				if (w==Q) {
					break loop;
				}
			}
			if (tmp.flag==1) {
				set.add(tmp.x);
			} else {
				set.remove(tmp.x);
			}
		}
		for (int i=w;i<Q;i++) {
			out.println(-1);
		}
		out.flush();
	}
}

class Event {
	int t;
	int flag;
	int x;
	Event(int t,int flag,int x) {
		this.t=t;
		this.flag=flag;
		this.x=x;
	}
}