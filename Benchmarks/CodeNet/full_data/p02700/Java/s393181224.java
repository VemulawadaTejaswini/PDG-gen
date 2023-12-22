import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 高橋体力
        int b = sc.nextInt(); // 高橋攻撃
        int c = sc.nextInt(); // 青木体力
        int d = sc.nextInt(); // 青木攻撃
     
        while (true) {
            c -= b;
            if(c <= 0) {
                System.out.println("Yes");
                break;
            }
            a -= d;
            if(a <= 0) {
                System.out.println("No");
                break;
            }
        }
	}
}