import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String baseStr = sc.next();
		String resultStr = sc.next();

		int result = 0;
		for(int i=0;i<baseStr.length();i++) {
			if(baseStr.charAt(i) != resultStr.charAt(i)) {
				result++;
			}

		}
		sc.close();

		System.out.println(result);

	}


}