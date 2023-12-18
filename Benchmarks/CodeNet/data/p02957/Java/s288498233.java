import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	        int A  = scan.nextInt();
	        int B  = scan.nextInt();
	        int a=0;
	        int b = 0;
	        for(int i= (A<B)?A:B ;i < ((A<B)?B:A);i++) {
	           	if(Math.abs(A-i) == Math.abs(B-i)){

	           		System.out.println(String.valueOf(i));
	           		return ;
	        	}
	        }
	        System.out.println("IMPOSSIBLE");
	}

}
