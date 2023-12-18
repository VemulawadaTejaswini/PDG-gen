import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int a[]=new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		if(sum<=K) {
			System.out.println(sum);
			return;
		}
		//System.out.println(sum);
		ArrayList<Integer> youso=new ArrayList<Integer>();
		for(int i=2;i<=(int)Math.sqrt(sum);i++) {
			if(sum%i==0) {
				i=sum/i;
				int sum2=0;
				int sum1=0;
				int b[]=new int[N];
				for(int x=0;x<N;x++) {
					b[x]=a[x]%i;

				}
				Arrays.sort(b);
				for(int x=0;x<N;x++) {
					if(sum2+b[x]<=K) {
						sum2+=b[x];
					}else {
						sum1+=i-b[x];
					}
				}

				//System.out.println(i+" "+sum2);
				if(sum2>=sum1) {
					System.out.println(i);
					return;
				}
				i=sum/i;
			}
		}
		for(int i=(int)Math.sqrt(sum);i>0;i--) {
			if(sum%i==0) {
				//int b[]=new int[N];
				int sum2=0;
				int sum1=0;
				int b[]=new int[N];
				for(int x=0;x<N;x++) {
					b[x]=a[x]%i;

				}
				Arrays.sort(b);
				for(int x=0;x<N;x++) {
					if(sum2+b[x]<=K) {
						sum2+=b[x];
					}else {
						sum1+=i-b[x];
					}
				}
				//System.out.println(i+" "+sum2);
				if(sum2>=sum1) {
					System.out.println(i);
					return;
				}

			}
		}

	}
}
