import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		double max = 0;
		double X =0;
		double Y =0;
		double Z =0;
		int ans=0;
		for(int i=1;i<=N;i++){
			X=(A*i)/B;
			Math.floor(X);
			//BigDecimal ab = new BigDecimal(String.valueOf(X));
			//BigDecimal ab1 = ab.setScale(0, RoundingMode.DOWN);

			Y=(i/B);
			
			//BigDecimal ib = new BigDecimal(String.valueOf(Y));
			//BigDecimal ib1 = ib.setScale(0, RoundingMode.DOWN);
			
			max=Math.max(max,Math.floor(X)-A*Math.floor(Y));

		}

		ans=(int) (max*10/10);

		System.out.println(ans);
    }
}