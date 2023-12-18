   import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int mado = sc.nextInt();
            int car = sc.nextInt();
            int result = mado - 2 * car;
            if(result < 0){
            	result = 0;
            }
    		// 出力
    		System.out.println(result);
    	}
    }