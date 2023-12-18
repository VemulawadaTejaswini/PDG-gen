import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		
		int n=sc.nextInt();
		String s=sc.next();
		
		 for (int i=0;i<s.length();i++){
	            System.out.print((char)((s.charAt(i)-'A'+ n)%26 + 'A'));
	        }
		sc.close();
	}

}