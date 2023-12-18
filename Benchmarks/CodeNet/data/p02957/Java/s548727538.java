import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		String ans = sum % 2 == 0 ? String.valueOf(sum/2) : "IMPOSSIBLE";
		System.out.printf("%s \n", ans);
	}
}
