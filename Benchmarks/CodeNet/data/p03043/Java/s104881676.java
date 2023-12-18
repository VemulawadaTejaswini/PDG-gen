import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int K=sc.nextInt();

		BigDecimal ans=new BigDecimal(0.0);

		BigDecimal nB=new BigDecimal((double)1/N);

		for(int i=1;i<N+1;i++){

			if(i<=K){

				int n=(K+(i*2-1))/(i*2);

				if(i==1) n--;

				double x=Math.pow(0.5, n);

				//System.out.println(n);

				BigDecimal bd=new BigDecimal(x);

				bd=bd.multiply(nB);

				ans=ans.add(bd);

			}else{

				BigDecimal bd=new BigDecimal(1.0);

				bd=bd.multiply(nB);

				ans=ans.add(bd);

			}

		}

		System.out.println(ans);

		sc.close();

	}

}
