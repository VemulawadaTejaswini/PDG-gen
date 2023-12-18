import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();
    	int d = sc.nextInt();

    	int d2 = d + 1 + d;
    	int ans = n / d2;
    	if (n % d2 > 0){
    		ans++;
    	}


    	// 出力
    	System.out.println(ans);
    }
}