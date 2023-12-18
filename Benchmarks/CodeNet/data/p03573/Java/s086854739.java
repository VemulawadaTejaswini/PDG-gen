import java.util.Scanner;

/**
 * http://abc075.contest.atcoder.jp/tasks/abc075_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int ans = 0;
		if(a==b){
			ans = c;
		}else if(a==c){
			ans = b;
		}else{
			ans = a;
		}
		
		System.out.println(ans);

	}

}
