import java.util.Scanner;
public class Main {
	public static int calc2(long a) {
	int i=0;
	for(int j=0;j<18;j++) {
		if(a%10!=0) {
			i=1;
			break;
			}
		else if(j==16&&a==10) {
			i=0;
			break;
		}
		else {
			a=(a-a%10)/10;;
		}
	}
		return i;
	}
	public static long calc(long a) {
		long i=0;
		for(;;) {
			if(1<=a&&a<10) {
				break;
			}
			else {
				i++;
				a=(a-a%10)/10;
			}
		}
		return i;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long ans=1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			if(a[i]==0) {
				ans=0;
			}
		}
		if(ans!=0) {
		for(int i=0;i<n;i++) {
			
			ans*=a[i];
			if(calc(ans)>=18&&calc2(ans)!=0) {
				ans=-1;
				break;
			}
			
		}
		}
		
		System.out.println(ans);
	}
}
