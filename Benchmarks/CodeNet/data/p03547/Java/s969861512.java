//package Beginner;
import java.util.Scanner;
import java.lang.Comparable;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		if(x.equals(y)) {
			System.out.println("=");
		}else if(x.compareTo(y)==-1) {
			System.out.println("<");
		}else if(x.compareTo(y)==1){
			System.out.println(">");
		}
		
		sc.close();
		
	}

}
