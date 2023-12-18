import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
	
		
		if(A+B>A-B) {
			if(A+B>A*B) {
				ans = A+B;
			}else {
				ans = A*B;
			}
		}else {
			if(A-B>A*B) {
				ans = A - B;
			}else {
				ans = A*B;
			}
		}
		
		
		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}

