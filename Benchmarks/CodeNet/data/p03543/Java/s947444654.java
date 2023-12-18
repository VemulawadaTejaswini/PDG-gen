import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        int sen = N/1000;
        int hyaku = (N/100)%10;
        int zyu = (N/10)%10;
        int one = N%10;
        boolean ans = false;
        if (hyaku == zyu) {
          if (sen == hyaku || zyu == one) {
            ans = true;
          }
        }
        if (ans) {
          System.out.println("Yes");
        } else {
		// 出力
		  System.out.println("No");
        }
	}
}