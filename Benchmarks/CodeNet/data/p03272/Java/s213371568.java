import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int i = sc.nextInt();
		
		int ans = (N + 1 - i);
   		System.out.println(ans);
		
   		sc.close();
        return ;

    }
    
}

