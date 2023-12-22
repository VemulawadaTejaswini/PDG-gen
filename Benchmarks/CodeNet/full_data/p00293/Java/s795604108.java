import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	public static int INF = 1 << 24;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Data> list = new ArrayList<Data>();
		
		int N = stdIn.nextInt();
		for(int i = 0; i < N; i++) {
			int h = stdIn.nextInt();
			int m = stdIn.nextInt();
			list.add(new Data(h,m));
		}
		int M = stdIn.nextInt();
		for(int i = 0; i < M; i++) {
			int h = stdIn.nextInt();
			int m = stdIn.nextInt();
			list.add(new Data(h,m));
		}
		Collections.sort(list,new MyComparator());
		Data tmp = list.get(0);
		System.out.printf("%1d:%02d ", tmp.h, tmp.m);
		int lastsm = tmp.sm;
		
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).sm == lastsm) {
				continue;
			}
			tmp = list.get(i);
			System.out.printf("%1d:%02d ", tmp.h, tmp.m);
			lastsm = tmp.sm;
		}
		System.out.println();
	}
	
}
class MyComparator implements Comparator<Data> {
	
	public int compare(Data o1, Data o2) {
		if(o1.sm < o2.sm) {
			return -1;
		}
		else if(o1.sm > o2.sm) {
			return 1;
		}
		return 0;
	}
}
class Data {
	int h;
	int m;
	int sm;
	
	Data(int h, int m) {
		this.h = h;
		this.m = m;
		sm = h*60+m;
	}
}

  