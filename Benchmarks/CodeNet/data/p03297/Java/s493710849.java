import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<t;i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			long d = in.nextLong();
			List<Long> stock = new ArrayList<>();
			if(judge(a,b,c,d,stock)) sb.append("Yes");
			else sb.append("No");
		}
		System.out.println(sb.toString());
	}
	
	public static boolean judge(long a,long b,long c,long d,List<Long> stock) {
		if(a<b) return false;
		else if(a%b>c) return false;
		else {
			long s = a%b+d;
			if(stock.contains(s)) return true;
			stock.add(s);
			return judge(s,b,c,d,stock);
		}
	}

}
