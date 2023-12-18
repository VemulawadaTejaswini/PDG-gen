import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();

		long ans = num / 11;
		ans *= 2;
		long tmp = num % 11;
		if(tmp >= 7){
			ans += 2;
		}else{
			ans++;
		}

		System.out.println(ans);
	}

}
