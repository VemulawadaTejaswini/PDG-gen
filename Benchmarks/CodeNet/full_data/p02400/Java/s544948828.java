import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		final double pie =  3.141592653589;
		Double d = sc.nextDouble();
		System.out.println(String.format("%.6f %.6f",d*d*pie ,2*d*pie));
	}
}