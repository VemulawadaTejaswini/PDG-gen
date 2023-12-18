import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		char c1 = s.charAt(2);
	    char c2 = s.charAt(3);
	    char c3 = s.charAt(4);		
	    char c4 = s.charAt(5);
		
		if(c1==c2&&c3==c4) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
