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
		//ArrayList<Integer> youso=new ArrayList<Integer>();
		for(int i=2;i<=(int)Math.sqrt(sum);i++) {
			if(sum%i==0) {
				i=sum/i;
				int sum2=0;
				int b[]=new int[N];
				for(int x=0;x<N;x++) {
					b[x]=a[x]%i;

				}
				Arrays.sort(b);
				int tmp=N-1;
				for(int x=0;x<N;x++) {
					int p=b[x];
					while(p!=0) {
						//System.out.println(tmp);
						if(i-b[tmp]>=p) {
							b[tmp]=(b[tmp]+p)%i;
							sum2+=p;
							p=0;
							if(b[tmp]==0)tmp--;
						}else {
							sum2+=i-b[tmp];
							p-=i-b[tmp];
							b[tmp]=0;

							tmp--;
						}
					}

				}

				//System.out.println(i+" "+sum2);
				if(sum2<=K) {
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
				int b[]=new int[N];
				for(int x=0;x<N;x++) {
					b[x]=a[x]%i;

				}
				Arrays.sort(b);
				int tmp=N-1;
				for(int x=0;x<N;x++) {
					int p=b[x];
					while(p!=0) {
						if(i-b[tmp]>=p) {
							b[tmp]=(b[tmp]+p)%i;
							sum2+=p;
							p=0;
							if(b[tmp]==0)tmp--;
						}else {
							sum2+=i-b[tmp];
							p-=i-b[tmp];

							b[tmp]=0;
							tmp--;
						}
					}

				}

				//System.out.println(i+" "+sum2);
				if(sum2<=K) {
					System.out.println(i);
					return;
				}
			}
		}

	}
}