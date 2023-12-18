import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();

		int min;
		int max;

		//max
		if(A>B) max=B;
		else max=A;

		//min
		if(A+B<=N)min=0;
		else {min=A+B-N;}
		
		// 出力	
		System.out.println(max + " " + min);
	}
}
