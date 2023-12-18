import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next() + sc.next();

//		String s = args[0] + args[1];
		double i = Double.parseDouble(s);
		String result ="";
		
		i = Math.sqrt(i);
		if (i - Math.floor(i) == 0){
			result = "Yes";
		}else{
			result = "No";
		}
		
		System.out.println(result);
		

	}

}