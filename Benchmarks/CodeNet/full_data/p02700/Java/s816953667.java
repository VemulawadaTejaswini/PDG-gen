import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		long aw = c-b;
		long t = a-d;
		if(aw>t && aw>=0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}