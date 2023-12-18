import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String input = sc.next();
		String ans = num < 3200 ? "red" : input;
		System.out.println(ans);
	}
}