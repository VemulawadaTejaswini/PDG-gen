import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Data[] list = new Data[n];
			for(int i = 0; i < n; i++) {
				int m = sc.nextInt();
				long a = sc.nextLong();
				long b = sc.nextLong();
				list[i] = new Data(m,a,b,i);
			}
			long nowTime = list[0].a;
			int w = 0;
			int ix = 0;
			ArrayList<Data> listX = new ArrayList<Data>();
			
			while(true) {
				for(int i = 0; i < listX.size(); i++) {
					if(listX.get(i).b <= nowTime) {
						w -= listX.get(i).m;
						listX.remove(i);
					}
				}
				for(int i = ix; i < n; i++) {
					if(list[i].a == nowTime) {
						listX.add(list[i]);
						ix++;
						w += list[i].m;
					}
				}

				
				if(w > 150) {
					System.out.println("NG");
					break;
				}
				if(ix >= n) break;
 				long nextTime = list[ix].a;
				nowTime = nextTime;
				
			}
			if(w <= 150) {
				System.out.println("OK");
			}
			
			
			
		}
	}
	
	static class Data {
		int id;
		int m;
		long a;
		long b;
		Data(int c, long d, long e, int id) {
			m = c;
			a = d;
			b = e;
			this.id = id;
		}
	}
	
	static class MyComp implements Comparator<Data> {

		@Override
		public int compare(Data o1, Data o2) {
			if(o1.a > o2.a) {
				return 1;
			}
			else if(o1.a < o2.a) {
				return -1;
			}
			return (int)(o1.b - o2.b);
		}
		
	}
	
		
}