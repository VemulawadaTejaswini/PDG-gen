import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		String ans = "";

		// Mapの宣言
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
		for (int i = 1; i <= N;i ++ ){
			// 文字列の入力
			int str = sc.nextInt();

        	map.put( str,i);

		}

        Object[] mapkey = map.values().toArray();
        for (Object nKey : mapkey)
        {
        	if(ans.isEmpty()) {
            	ans = "" + nKey;
        	}else {
            	ans = ans + " " + nKey;
        	}
        }

		
		System.out.println(ans);

   		sc.close();
        return ;

    }
    
    static long Factorial (int i) {
    	if (i == 0) {return 1;}

    	if (i == 1) {
    		return 1;
    	}else {
    		return (i * Factorial(i-1));
    	}
    }
}

