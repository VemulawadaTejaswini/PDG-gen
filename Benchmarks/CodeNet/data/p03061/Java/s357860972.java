import java.util.Scanner;

public class Main {
	
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				if(gcd(A[j],A[i])>max&&j!=i){
					max=gcd(A[j],A[i]);
				}
			}
			
		}
		System.out.println(max);

	}

}
