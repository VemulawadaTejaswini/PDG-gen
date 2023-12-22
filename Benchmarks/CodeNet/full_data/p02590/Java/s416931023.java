
import java.util.*;
public class Main{
static int p=200003;
	public static void main(String[] args) {
							Scanner sc=new Scanner(System.in);
							int n=sc.nextInt();
							long a[]=new long[n];
							for(int i=0;i<n;i++) {
								a[i]=sc.nextLong();
							}
							long sum=0;
							for(int i=0;i<n;i++) {
								for(int j=i+1;j<n;j++) {
									sum+=(((a[i]+p)%p)*((a[j]+p)%p))%p;
									
								}
							}
							System.out.print(sum);
	}

}
