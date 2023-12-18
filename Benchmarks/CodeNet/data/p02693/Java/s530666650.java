import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flg = 0;

        for(int i=1;; i++) {
            int num = k * i;
            if(num < a) continue;
            if(a <= num && b >= num) {
                System.out.println("OK");
                flg = 1;
                break;
            }
            if(num > b) break;
        }
        if(flg == 0) {
            System.out.println("NG");
        }
	}
}