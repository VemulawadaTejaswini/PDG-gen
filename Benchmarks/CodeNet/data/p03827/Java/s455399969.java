import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//case : 入力された数値を取得するとき
		int n = Integer.parseInt(sc.next());
		//case : 入力された文字列を取得するとき
		String str = sc.next();
		String[] strArr = str.split("");
		
		int result = 0;
		int max = 0;
		for (int i=0; i<n; i++) {
			if(strArr[i].equals("I")) {
				result++;
			} else {
				result--;
			}
			if (max < result) {
				max=result;
			}
		}
		
		System.out.println(max);
	}
	

}
