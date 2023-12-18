import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();

    	int ans = 0;
    	int sum = 0;
    	int nokori = b;

    	for (int i = 0; i < b; i++){

    		ans++;
    		sum = sum + (a - 1);
    		if (b > sum){
    			break;
    		}
    	}

    	// 出力
    	System.out.println(ans);
    }
}