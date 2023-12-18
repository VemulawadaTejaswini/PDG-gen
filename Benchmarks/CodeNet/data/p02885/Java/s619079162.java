import java.util.*;
import java.text.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##,###.##");
		System.out.println("window length??");
		int Win=sc.nextInt();
		System.out.println("Enter the first part.");
		int A= sc.nextInt();
		System.out.println("Enter the 2nd part.");
		int B= sc.nextInt();
		int Answer= Win-(A+B);
		System.out.println(Win+" "+Answer);


	}
}