import java.io.*;
import java.util.*;
public class Main {
	static int n;
	static int m;
	static char[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Data[] list = new Data[n];
			for(int i = 0; i < n; i++) {
				int m = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				list[i] = new Data(m,a,b,i);
			}
			int nowTime = list[0].a;
			int w = 0;
			ArrayList<Data> listX = new ArrayList<Data>();
			while(true) {
				for(int i = 0; i < listX.size(); i++) {
					if(listX.get(i).b <= nowTime) {
						w -= listX.get(i).m;
						listX.remove(i);
					}
				}
				for(int i = 0; i < n; i++) {
					if(list[i].a == nowTime && list[i].b > nowTime) {
						listX.add(list[i]);
						w += list[i].m;
					}
				}
				
				if(w > 150) {
					System.out.println("NG");
					break;
				}
				int nextTime = Integer.MAX_VALUE;
				for(int i = 0; i < n; i++) {
					if(list[i].a > nowTime && list[i].a < nextTime) {
						nextTime = list[i].a;
					}
				}
				if(nextTime == Integer.MAX_VALUE) {
					listX.clear();
					m = 0;
					break;
				}
				else {
					nowTime = nextTime;
				}
				
			}
			if(w <= 150) {
				System.out.println("OK");
			}
			
			
		}
	}
	
	static class Data {
		int id;
		int m;
		int a;
		int b;
		Data(int c, int d, int e, int id) {
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
			return o1.b - o2.b;
		}
		
	}
	
		
}