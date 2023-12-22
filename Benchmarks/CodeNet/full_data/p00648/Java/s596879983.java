import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int channelCnt = sc.nextInt();
		Queue queue = new PriorityQueue(1, new Main().new MyComparator());
		for(int i=0 ; i<channelCnt ; i++) {
			Bangumi bangumi = new Main().new Bangumi(sc.next(), sc.next(), sc.next());
			queue.add(bangumi);
		}
		int favCnt = sc.nextInt();
		List list = new ArrayList();
		for(int j=0 ; j<favCnt ; j++) {
			list.add(sc.next());
		}
		List favList = new ArrayList();
		Object[] o = queue.toArray();
		Arrays.sort(o, new Main().new MyComparator());
		for(int i=0 ; i<o.length ; i++) {
			Bangumi b = (Bangumi)o[i];
			for(int j=0 ; j<list.size() ; j++) {
				if(list.get(j).toString().equals(b.name)) {
					favList.add(b);
				}
			}
		}
		Queue queue2 = new PriorityQueue(1, new Main().new MyComparator());
		outside: for(int i=0 ; i<o.length ; i++) {
			Bangumi b = (Bangumi)o[i];
			boolean flg = true;
			for(int j=0 ; j<favList.size() ; j++) {
				Bangumi bb = (Bangumi)favList.get(j);
				if((b.time+30) > bb.time && (b.time+30) < (bb.time+30)) {
					flg = false;
				}
			}
			if(flg)
				queue2.add(b);
		}
		Object[] o1 = queue2.toArray();
		Arrays.sort(o1, new Main().new MyComparator());
		int beforeEnd = 0;
		int result = 0;
		for(int l=0 ; l<o1.length ; l++) {
			if(((Bangumi)o1[l]).time > beforeEnd) {
				result++;
				beforeEnd = ((Bangumi)o1[l]).time + 30;
			}
		}
		System.out.println(result);
	}









	public class MyComparator implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			Bangumi a = (Bangumi)o1;
			Bangumi b = (Bangumi)o2;

			if(a.time > b.time)
				return 1;
			else if(a.time < b.time) {
				return -1;
			}else {
				return 0;
			}
		}
	}



	public class Bangumi {
		String name;
		int time;
		public Bangumi(String name, String youbi, String time){
			this.name = name;
			this.time = new Integer((youbi + time)).intValue();
		}
	}
}