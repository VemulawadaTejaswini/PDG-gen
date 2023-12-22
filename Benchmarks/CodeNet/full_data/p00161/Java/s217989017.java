import java.util.*;

/* 46ツ閉ェツスツタツーツト */
public class Main {
	static class Team{
		int num , time;
		public Team(int n, int t1, int t2, int t3 , int t4 ) {
			num = n;
			time = t1 + t2 + t3 + t4;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			LinkedList<Team> list = new LinkedList<Team>();
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				int g = sc.nextInt();
				int t1 = sc.nextInt() * 60 + sc.nextInt();
				int t2 = sc.nextInt() * 60 + sc.nextInt();
				int t3 = sc.nextInt() * 60 + sc.nextInt();
				int t4 = sc.nextInt() * 60 + sc.nextInt();
				Team t = new Team(g,t1,t2,t3,t4);
				list.add(t);
			}
			Team win = list.get(0), swin = list.get(1) , boo = win , worst = win;
			for ( int i = 1; i < list.size(); i++ ) {
				if ( win.time > list.get(i).time ) {
					swin = win;
					win = list.get(i);
				} else if ( swin.time > list.get(i).time )
					swin = list.get(i);
				if ( worst.time < list.get(i).time ) {
					boo = worst;
					worst = list.get(i);
				} else if ( boo.time < list.get(i).time )
					boo = list.get(i);
			}
			System.out.println(win.num+"\n"+swin.num+"\n"+boo.num);
		}
	}
}