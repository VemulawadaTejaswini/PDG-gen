
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		int k = sc.nextInt();;

		if(str.length == 1){
			System.out.println(k/2);
			return;
		}
		int changeCount = 0;
		for(int i = 1; i < str.length; i++){
			if(str[i] == str[i - 1]){
				changeCount++;
				str[i] = 'A';
			}
		}
//		System.out.println(changeCount);
		long result = (long)k*changeCount;

		if(str[0] == str[str.length - 1]){
			result += k - 1;
		}
		System.out.println(result);
	}

}
