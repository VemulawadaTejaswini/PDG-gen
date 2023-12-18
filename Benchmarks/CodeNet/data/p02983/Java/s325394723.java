import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		long MOD=1000000007L;

		Scanner sc = new Scanner(System.in);

		long L=sc.nextLong();
		long R=sc.nextLong();
		int l=(int)L%2019;
		int r=(int)R%2019;
		int ans=2018;

		if((int)L/2019 != (int)R/2019)System.out.println(0);
		else{
			for(int i=l;i<r;++i){
				for (int j=l+1;j<=r;++j){
					ans=Math.min(ans, (i*j)%2019);
				}
			}
		}
		System.out.println(ans);
	}
}