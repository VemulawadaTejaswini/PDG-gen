
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long N;
		long[] maxOn=new long[5];

		N=sc.nextLong();

		for(int i=0;i<5;i++) {
			String str=sc.next();
			maxOn[i]=Long.parseLong(str);
		}

		long[] city=new long[6];

		for(int i=0;i<5;i++) {
			if(i==0) city[i]=N;
			else city[i]=0;
		}

		int ans=0;

		while(true) {

			ans++;
			//System.out.println(ans);

			for(int i=4;i>=0;i--) {
				if(city[i]==0) continue;

				// move

				if(city[i]>maxOn[i]) {
					city[i]=city[i]-maxOn[i];
					city[i+1]+=maxOn[i];
				}else {
					city[i+1]+=city[i];
					city[i]=0;
				}

			}

			if(city[5]==N) break;

		}

		System.out.println(ans);

		sc.close();

	}
}
