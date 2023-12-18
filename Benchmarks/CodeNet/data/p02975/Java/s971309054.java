import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] arguments) {
		Test.check(arguments);
		Integer number = Integer.valueOf(arguments[0]);

		int[] anArray = new int[number];

		for(Integer i = 0; i < number; i++) {
			anArray[i] = Integer.valueOf(arguments[i+1]);
		}
		
		for(Integer j = 0; j < number; j++){
			if(j == 0){
				int checkNumber = anArray[j+1] ^ anArray[number-1];
				if(anArray[j] != checkNumber) {System.out.println("No"); System.exit(0);;}
			}else if (j == number-1){
				int checkNumber = anArray[j-2] ^ anArray[j-1];
				if(anArray[j] != checkNumber) {System.out.println("No"); System.exit(0);;}
			}else {
				int checkNumber = anArray[j-1] ^ anArray[j+1];
				if(anArray[j] != checkNumber) {System.out.println("No");System.exit(0);;}
			}
		}
		System.out.println("Yes");
		return;
	}
	private static void check(String[] arguments){
		if(Integer.valueOf(arguments[0]) < 3) {
			System.out.println("正しい値を入力してください");
			System.exit(0);
		}else if(Integer.valueOf(arguments[arguments.length-1]) > 10*10*10*10*10) {
			System.out.println("正しい値を入力してください");
			System.exit(0);
		}
		return;
	}
}