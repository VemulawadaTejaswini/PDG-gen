import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long m=in.nextLong(),n=in.nextLong(),d=1000000007;
		long a=m;
		for(int i=2;i<=n;i++)a*=m;
		System.out.println(a%d);
	}

}
