import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int ans = (A - 1) * (B - 1 );
   		System.out.println(ans);
		
   		sc.close();
        return ;

    }
    
}

