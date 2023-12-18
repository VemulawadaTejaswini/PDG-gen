
import java.util.*;

public class Main{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Long> s1=new HashSet<>();
		
		long x=0;
		for (int i = 0; i < n; i++) {
			long c=sc.nextLong();
			if(!s1.contains(c))
				x+=c;
			s1.add(c);
		}
		long y=0;
		int m=sc.nextInt();
		for (int i = 0; i <m; i++) {
			y+=sc.nextLong();
		}
		if(x>y)
		{
			System.out.println("NO");
		}
		else
			System.out.println("YES");

	}

}
