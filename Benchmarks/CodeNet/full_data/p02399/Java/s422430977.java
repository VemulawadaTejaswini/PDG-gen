import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double a = in.nextInt();
		double b = in.nextInt();
		
		System.out.println(((int)(a/b)) + " " + (int)(a%b) +  " " + (a/b));
	}
}
