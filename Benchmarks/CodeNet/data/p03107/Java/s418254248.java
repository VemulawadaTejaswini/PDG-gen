import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		int len=s.length();
		int count_0=0;
		int count_1=0;
		for (int i=0;i<len;++i) {
			if(s.charAt(i)=='0')++count_0;
			if(s.charAt(i)=='1')++count_1;
		}
		System.out.print(Math.min(count_0,count_1)*2);
}
}
//end
