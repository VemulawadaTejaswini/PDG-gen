import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();
    	Sring ans = "No";

    	for(int i = 1; i <=  9; i++){
    		for(int k = 1; k <= 9; k++){
    			if (n == i * k){
    				ans = "Yes";
    				break;
    			}
    		}
    	}


    	// 出力
    	System.out.println(ans);
    }
}