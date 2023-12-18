import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int values[] = {A,B,C};
		Arrays.sort(values);
		int answer = values[2]*10 + values[1] +values[0];
 		System.out.println(answer);
	}
}