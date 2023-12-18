import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long[][] yakusu = new long[(int)n/3][2];
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				yakusu[count][0]=i;
				yakusu[count][1]=n/i;
				count++;
			}
		}
long max= Long.MAX_VALUE;
		for(int i=0;i<count;i++) {
			long keta1=Long.toString(yakusu[i][0]).length();
			long keta2=Long.toString(yakusu[i][1]).length();
			if(Math.max(keta1,keta2)<max) max=Math.max(keta1, keta2);
		}
		
		System.out.println(max);
	}
}
