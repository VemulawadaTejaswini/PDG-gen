import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long n=Long.parseLong(scan.next());
		long min=Long.MAX_VALUE;
		for (int i=0;i<5;++i) {
			min=Math.min(min, Long.parseLong(scan.next()));
		}
		System.out.print((long)Math.ceil((double)n/min)+4);
	
}
}
//end
