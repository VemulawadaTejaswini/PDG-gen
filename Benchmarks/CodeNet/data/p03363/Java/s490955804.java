import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long N=scan.nextLong();
		long a[]=new long[(int) (N+1)];
		a[0]=0;
		a[1]=scan.nextLong();
		for(long i=2;i<N+1;i++){
			long c=scan.nextLong();
			a[(int) i]=a[(int) (i-1)]+c;
		}
		Arrays.sort(a);
		long ans=0;
		long co=0;
		for(long i=1;i<N+1;i++){
			if(a[(int) i]!=a[(int) (i-1)]){
				if(co!=0){
					ans+=(co+1)*co/2;
					co=0;
				}
			}
			else{
				co++;
			}
		}
		ans+=(co+1)*co/2;
		System.out.println(ans);
	}
}
