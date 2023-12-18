import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		double s = w *h;

		System.out.println(s/2);

		if(w<2 || h<2){
			System.out.println(0);
		}else if(w/2 == x  && h/2 == y ){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}
