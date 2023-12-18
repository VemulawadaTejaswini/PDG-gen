import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		long a=s.nextLong(),b=s.nextLong(),k=s.nextLong();
		if(a>=k)
			System.out.println(a-k+" "+b);
		else
			System.out.println("0 "+Math.max(0,b-k+a));
	}
}
