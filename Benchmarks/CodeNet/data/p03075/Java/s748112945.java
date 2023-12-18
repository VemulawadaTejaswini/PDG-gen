import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str;
		String str1;
		String str2;
		String str3;
		String str4;
		String str5;
		
		int a,b,c,d,e,k;
		
		System.out.println("aの値を入力してください");
		str = scanner.next();
		System.out.println("bの値を入力してください");
		str1 = scanner.next();
		System.out.println("cの値を入力してください");
		str2 = scanner.next();
		System.out.println("dの値を入力してください");
		str3 = scanner.next();
		System.out.println("eの値を入力してください");
		str4 = scanner.next();
		System.out.println("kの値を入力してください");
		str5 = scanner.next();
		
		
		a = Integer.parseInt(str);
		b = Integer.parseInt(str1);
		c = Integer.parseInt(str2);
		d = Integer.parseInt(str3);
		e = Integer.parseInt(str4);
		k = Integer.parseInt(str5);
		
		if (e-a  <= k) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
		
		
		
		
 
	}

}
