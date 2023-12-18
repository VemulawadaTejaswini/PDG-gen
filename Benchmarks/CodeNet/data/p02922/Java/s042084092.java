import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();

    	int ans = 0;

    	for (int i = 0; i < b; i++){
    		ans++;
    		 b = b - (a - 1);
    		if (ans <= 1){
    			break;
    		}
    	}

    	// 出力
    	System.out.println(ans);
    }
}