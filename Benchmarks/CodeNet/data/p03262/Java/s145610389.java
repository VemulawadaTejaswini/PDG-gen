import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		int answer = 1000000000;
		for(int i=0;i<N;i++){
			int x = sc.nextInt();
			if(answer> Math.abs(X-x)){
				answer = Math.abs(X-x);
			}
		}
		System.out.println(answer);
	}
}