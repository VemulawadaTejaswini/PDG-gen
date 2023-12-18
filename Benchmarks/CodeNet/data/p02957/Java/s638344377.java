import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	        int A  = scan.nextInt();
	        int B  = scan.nextInt();
	        for(int i=0;i<Integer.MAX_VALUE-1;i++) {
	        	if(Math.abs(A-i) == Math.abs(B-i)) {
	        		System.out.println(String.valueOf((A+B)/2));
	        		return;
	        	}
	        }
	        System.out.println("IMPOSSIBLE");
	}

}

