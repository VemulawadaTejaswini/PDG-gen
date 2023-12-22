import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				int M=sc.nextInt();
				if(N+M==0) break;
				int[] p=new int[M+1];
				for(int i=0; i<N; i++) {
					int d=sc.nextInt();
					int v=sc.nextInt();
					p[d]=Math.max(v, p[d]);
				}
				int sum=0;
				for(int i=1; i<=M; i++) {
					sum+=p[i];
				}
				System.out.println(sum);
			}
			
			
		}
		
	}
}

