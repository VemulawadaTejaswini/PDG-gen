import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 文字列整数の入力
		int N = sc.nextInt();
		String S = sc.next();
		int  len = N;
		
		if(len % 2 != 0) {
			System.out.println("No");
	   		sc.close();
	        return ;
		}
		
		int hanbun = len / 2;
		
		String a = S.substring(0, hanbun);
		String b = S.substring(hanbun, len);
		
		if(a.equals(b)) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}

   		sc.close();
        return ;

    }
    
}

