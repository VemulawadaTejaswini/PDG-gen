import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    // 入力受付
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    String str = scan.next();

	    if(n % 2 != 0){
	        System.out.println("No");
	        return;
	    }

	    int a = n / 2;
	    String splitStrA = str.substring(0, a);
	    String splitStrB = str.substring(a);

	    if(splitStrA.equals(splitStrB)){
	        System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }

	}
}