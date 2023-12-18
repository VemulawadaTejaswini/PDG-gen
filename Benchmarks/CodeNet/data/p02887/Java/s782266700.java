
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		//N=10, S= "aabbbbaaca"なら
		//abacaになるので、５
		//先頭からみて、色が変わるところでカウントして、１足せばいい。
		
		int ans = 1;//最初から1足しておく。
		
		for(int i=0;i<S.length()-1;i++) {
			if(S.charAt(i)!=S.charAt(i+1)) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}

}
