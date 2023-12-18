import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.nextLine());
		String SecondLine = sc.nextLine();
		int[] ArrayNint = new int[N];
		for (int i = 0; i < N; i++) {
			ArrayNint[i]= Integer.parseInt(SecondLine.split(" ")[i]);
		}
		int cnt = 0;
		boolean trigger;
		trigger = true;
		while (trigger) {
			for (int i =0 ; i< ArrayNint.length ; i++ ) {
				if (ArrayNint[i]% 2 == 1) {
					trigger = false ;
					break;
				} else {
					ArrayNint[i] = ArrayNint[i] / 2;
				} // if
			} // for
			if (trigger) {
			cnt++;
			}
		} // while
		System.out.println(cnt);
	}
}
