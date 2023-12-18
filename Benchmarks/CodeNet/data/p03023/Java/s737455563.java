import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int base = 180;
		int mult = 180;
		int N = sc.nextInt();
		int degrees = base+ (mult*(N-3));
		System.out.println(degrees);
	
	}

}