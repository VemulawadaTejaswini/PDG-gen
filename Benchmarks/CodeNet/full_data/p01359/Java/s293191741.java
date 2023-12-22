import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			if (N + Q == 0)
				break;
			E[] e = new E[N];
			for (int i = 0; i < N; i++) {
				String s =sc.next();
				int len = sc.nextInt();
				int end= sc.nextInt();
				e[i]=new E(s,len,end);
			}
			l:for (int i = 0; i < Q; i++) {
				int y = sc.nextInt();
				for(E era:e){
					if(era.end-era.len < y && y <= era.end){
						System.out.println(era.name+" "+(y-era.end+era.len));
						continue l;
					}
				}
				System.out.println("Unknown");
			}
		}
	}
	static class E{
		String name;
		int len;
		int end;
		public E(String name, int len, int start) {
			super();
			this.name = name;
			this.len = len;
			this.end = start;
		}
		
	}
}