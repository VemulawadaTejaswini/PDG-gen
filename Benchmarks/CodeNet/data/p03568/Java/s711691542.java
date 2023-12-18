import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		int c=1;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			if(A[i]%2==1) {
				A[i]=1;
			}
			else {
				A[i]=2;
			}
			c=c*A[i];
		}
		c=(int)Math.pow(3, N)-c;
		System.out.println(c);
		
	}
}
