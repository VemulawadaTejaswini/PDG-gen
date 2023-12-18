import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	        int A  = scan.nextInt();
	        int B  = scan.nextInt();
	        if(A+B%2 == 0)
	        	System.out.println(String.valueOf((A+B)/2));
	        else{
	        	System.out.println("IMPOSSIBLE");
	        }
	}

}
