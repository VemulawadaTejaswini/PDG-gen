import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		int n=in.nextInt();
		double sum=0.0;
		
		for(int i=0;i<n;i++) {
			double v=in.nextDouble();
			String s=in.next();
			
			if(s.equals("JPY"))sum+=v;
			else sum+=380000.0*v;
		}
		
		System.out.println(sum);
	}

}
