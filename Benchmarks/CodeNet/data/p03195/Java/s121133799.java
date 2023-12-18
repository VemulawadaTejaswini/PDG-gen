import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

        /*
        ひとつでも奇数のものがあれば first の勝ち？
        */
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a % 2 != 0) {
                System.out.println("fisrt");
                return;
            }
        }
        System.out.println("second");
	}
}