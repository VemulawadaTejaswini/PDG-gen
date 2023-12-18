import java.util.Scanner;

public class Main {
	public static void solution(int x, int y) {
		System.out.println(1.0*(x+y)/2);
	}
		
	
	public static void main(String args []) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		solution(x,y);
	}
}