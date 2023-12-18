
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int q = sc.nextInt();
		long[] d = new long[k];
		for (int i=0;i<k;i++) {
			d[i]=sc.nextLong();
		}
		for (int i=0;i<q;i++) {
			long n = sc.nextLong();
			long x = sc.nextLong();
			long m= sc.nextLong();
			long[] dMod=new long[k];
			long[] sum = new long[k+1];
			long[] countZero = new long[k+1];
			for (int j=0;j<k;j++) {
				dMod[j]=d[j]%m;
				sum[j+1] = sum[j]+dMod[j];
				countZero[j+1] = countZero[j]+(dMod[j]==0 ? 1 : 0);
			}
			long fin = x + (sum[k]) * ((n-1)/k) + sum[(int)((n-1)%k)];
			long zeros = (countZero[k]) * ((n-1)/k) + countZero[(int)((n-1)%k)];
			
			System.out.println(n-1 - (fin/m - x/m) - zeros);
		}
		
	}
	
	
	
	
	
}


