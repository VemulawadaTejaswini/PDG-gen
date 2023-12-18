import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long tmp1 = sc.nextInt();
		long tmp2 = sc.nextInt();
		long a = Math.min(tmp1, tmp2);
		long b = Math.max(tmp1, tmp2);

		long cnt = 0;
		if(a == 1 && b == 1) {
			cnt = 1;
		} else if(a == 1 && b != 1){
			cnt =  b - 2;
		} else {
			cnt = (b - 2) * (a - 2);
		}
		System.out.println(cnt);
	}
}
