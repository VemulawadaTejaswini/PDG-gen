import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		double ans;
		double tmp=0;
		for(int i=0;i<N;i++) {
			tmp += (double)1/A[i]; 
		}
		ans=1/tmp;		
		System.out.println(ans);
	}
	
}