import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= 9;i ++ ){
			for (int j = 1; j <= 9;j ++ ){
	        	if(N == i*j) {
	        		System.out.println("Yes");
	           		sc.close();
	                return ;
	        	}
	        }
		}

		System.out.println("No");

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

