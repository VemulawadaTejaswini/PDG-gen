import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int oddCnt = 0;
		int evenCnt = 0;
		for(int i=0;i<X;i++) {
			int num = sc.nextInt();
			if(num %2 == 0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		}
		sc.close();
		if(oddCnt%2!=0) {
			System.out.println("NO");
			return;
		}
		evenCnt += (oddCnt/2);
		if(evenCnt%2==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}