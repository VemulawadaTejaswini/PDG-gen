
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("A=");
		int A = sc.nextInt();
		
		System.out.print("B=");
		int B = sc.nextInt();
		
		System.out.print("C=");
		int C = sc.nextInt();
		
		System.out.println();
		
	    if (A>=B&&A>=C) {
	    	System.out.println("最大値は"+(A*10+B+C)); 	
	    }
	    if (B>=A&&B>=C) {
	    	System.out.println("最大値は"+(B*10+A+C));
	    }
		if(C>=A&&C>=B) {
			System.out.println("最大値は"+(C*10+A+B));
			
		}
	}

}
