import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long l=Long.parseLong(scan.next());
		long r=Long.parseLong(scan.next());
		
		long tmp=l;
		l=l%2019;
		
		long mod=2019;
		for (long i=l;i<=l+(r-tmp);++i) {
			mod=Math.min(mod, i%2019);
		}
		System.out.print((mod*++mod)%2019);

}
}
//end