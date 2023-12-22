import java.util.Scanner;

public class Main {
	static Long num;
	public static void main(String[] args) {


		try (Scanner sc = new Scanner(System.in)) {
			Long a = Long.parseLong(sc.next());
			Long b = Long.parseLong(sc.next());
			Long c = Long.parseLong(sc.next());
			Long d = Long.parseLong(sc.next());
			
			
			num = a*c;
			num = Math.max(num,a*d);
			num = Math.max(num,b*c);
			num = Math.max(num,b*d);
			Long anser = num;
			System.out.println(anser);
		}
	}		
}