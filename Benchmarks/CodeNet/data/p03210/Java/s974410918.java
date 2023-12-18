import java.util.*;

public class Main {
	//constant
	public static final String YES = "YES";
	public static final String NO = "NO";
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); //整数の入力
		if (age == 7 || age == 5 || age == 3) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
	}
}