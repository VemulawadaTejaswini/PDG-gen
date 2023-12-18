import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	int ans;

    	if (a < d && b < c) {
    		ans = 0;
    	} else if (d < a && c < b) {
    		ans = 0;
    	} else if (a < c && b < d) {
    		ans = d - c;
    	} else if (c < a && d < b) {
    		ans = a - b;
    	} else {
    		ans = Math.abs(c - b);
    	}


    	// 出力
    	System.out.println(ans);
    }
}