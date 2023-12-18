import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int now = sc.nextInt();
		int next = 0;
		int count = 0;
		int answer = 0;
		for(int i=0; i<N-1; i++){
			next = sc.nextInt();
			if(now >= next){
				count++;
			} else{
				answer=Math.max(answer,count);
				count=0;
			}
			now = next;
		}
		answer=Math.max(answer,count);
		System.out.println(answer);

		sc.close();
	}
};