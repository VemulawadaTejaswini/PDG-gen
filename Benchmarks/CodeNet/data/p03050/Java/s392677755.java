
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		sc.close();
		long ans = 0;
		long l = 0;
		long r = 0;
		for(long i=1; i <= Math.sqrt(n); i++){
			if(n%i == 0) {
				l = i;
				r = n/i;
				if (l-1!=0 && n/(l-1) == n%(l-1)) ans += l-1;
				if (l!=r && r-1!=0 && n/(r-1) == n%(r-1)) ans += r-1;
			}
		}
		System.out.println(ans);
	}

}

