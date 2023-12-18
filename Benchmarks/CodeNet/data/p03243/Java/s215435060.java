import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int result = 0;
		result += n/100;
		result = result * 111;

		System.out.println(n<=result
			?result
			:result==999
				?result+112
				:result+111);




	}
}