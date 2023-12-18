import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int  ans = 0;


		if(A > 9) {
			System.out.println("-1");
		}else if( B > 9) {
			System.out.println("-1");
		}else {
			System.out.println(A*B);
		}
		
		
		

   		sc.close();
        return ;

    }
    
}

