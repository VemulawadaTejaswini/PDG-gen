import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int C =sc.nextInt();
		int count=0;
		int[] B = new int[M];
		int[] A = new int[M];
		int sum=0;
		
		for(int i=0;i<M;i++) {
			B[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			sum=C;
			for(int j=0;j<M;j++) {
				int s=sc.nextInt();
				sum+=(s*B[j]);
			}
			if(sum>0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
