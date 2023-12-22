import java.util.*;

public class Main {
	

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long end=1;
		for(int i=0;i<18;i++) {
			end*=10;
		}
		
		
		long ans=1;
		long[] a=new long[n];
		//int count=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			if(a[i]==0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		for(int i=0;i<n;i++) {
			ans*=a[i];
			//System.out.println(ans);
			if(ans>end) {
				ans=-1;
				break;
			}
		}
		/*long a = ans;
		for(int i=0;i<18;i++) {
			a;
		}*/
			/*ans*=tmp;
			a*=tmp;
			while(a/10>=1) {
				a%=10;
				count++;
				if(count>=18 && a!=0) {
					ans=-1;
					break;
				}
			}
			
		}*/
		System.out.println(ans);
	}

}
