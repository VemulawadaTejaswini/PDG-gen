import java.util.*;

public class Main {
	public static void main(String[] args){
		//入力値を受け取る
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		//inputのなかで"1"に一致する数をカウント
		int count = 0;
		for(char x: input.toCharArray()){
			if(x == '1'){
				count++;
			}
		}
		System.out.println(count);
	}
}