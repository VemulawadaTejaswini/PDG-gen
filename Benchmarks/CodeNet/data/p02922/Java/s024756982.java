mport java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();	
		System.out.println(y==1?0:(int)Math.ceil(y/x));

	}

}
