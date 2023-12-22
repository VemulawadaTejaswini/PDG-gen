
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x= sc.nextDouble();
		System.out.println((int)Math.ceil((Math.log(x)-Math.log(100))/Math.log(1.01)));
	}
}