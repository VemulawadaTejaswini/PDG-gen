import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				int[] dx= {-1, 0, 1, 0};
				int[] dy= {0, -1, 0, 1};
				int[] x=new int[N];
				int[] y=new int[N];
				x[0]=0;
				y[0]=0;
				int xmin=0, xmax=0, ymin=0, ymax=0;
				for(int i=1; i<N; i++) {
					int n=sc.nextInt();
					int d=sc.nextInt();
					x[i]=x[n]+dx[d];
					y[i]=y[n]+dy[d];
					xmin=Math.min(x[i], xmin);
					xmax=Math.max(x[i], xmax);
					ymin=Math.min(y[i], ymin);
					ymax=Math.max(y[i], ymax);
					
				}
				System.out.printf("%d %d\n", xmax-xmin+1, ymax-ymin+1);
				
				
			}


		}
	}
}
