import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b) {
            System.out.println(0);
        } else {
        int cnt = 1;
        while (a < b) {
            a += a-1;
            cnt += 1;
        }
        System.out.println(cnt);
    }

	}
}
