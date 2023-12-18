import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int k = sc.nextInt();
    	int s = sc.nextInt();

    	int cnt = 0;

    	for (int i = 0; i <= k; i++){
    		int x = 0;
        	for (int j = 0; j <= k; k++){
        		int y = 0;
        		if((s - (x + y)) >= 0 && (s - (x + y)) <= k){
            		cnt++;
            	}
        		y++;
        	}
        	x++;
    	}

    	// 出力
    	System.out.println(cnt);
    }
}
