import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] X =new int [N][D];
		int count=0;
		int sum=0;
				
		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				X[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				for(int k=0;k<D;k++) {
					//System.out.println(Math.pow(Math.abs(X[i][k]-X[j][k]), 2));
					sum+=Math.pow(Math.abs(X[i][k]-X[j][k]), 2);
				}
				if(Math.sqrt(sum)==(int)Math.sqrt(sum)) {
					count++;
				}
				sum=0;
			}
		}
		System.out.print(count);
		sc.close();
	}
}
