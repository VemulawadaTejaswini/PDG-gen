import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 標準入力からデータを読み込む準備
		Scanner sc = new Scanner(System.in); 
		
		while (true) {
  			 String str = sc.next();
 			 if (str.equals("-"))	break;
			 int h = sc.nextInt();
			 int[] a = new int[h];
			 for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			 }

			for (int i = 0; i < a.length; i++) {
				str = str.substring(a[i])+str.substring(0,a[i]);
			 }
			System.out.println(str);
		}

		sc.close();
	}

}
