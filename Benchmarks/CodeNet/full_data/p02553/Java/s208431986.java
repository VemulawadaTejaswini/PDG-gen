import java.util.Scanner;


public class Main {


	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Long a = Long.parseLong(sc.next());
		Long b = Long.parseLong(sc.next());
		Long c = Long.parseLong(sc.next());
		Long d = Long.parseLong(sc.next());
		
		Long max = -1000000000000000000l;
		
		max = Math.max(max,a * c);
		max = Math.max(max,a * d);
		max = Math.max(max,b * c);
		max = Math.max(max,b * d);
		System.out.println(max);
	}
}
