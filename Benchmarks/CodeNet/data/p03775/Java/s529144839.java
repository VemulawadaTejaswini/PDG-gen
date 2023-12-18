import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long min=N;
		for(int i=1;i<=Math.pow(N, 0.5);i++) {
			long A=0;
			long B=0;
			if(N%i!=0) {
				continue;
			}else {
				A=N/i;
				B=N/A;
				String a=String.valueOf(A);
				String b=String.valueOf(B);
				long len=Math.max(a.length(),b.length());
				if(len<min) {
					min=len;
				}
				
				
			}
			
		}
		System.out.println(min);

	}

}
