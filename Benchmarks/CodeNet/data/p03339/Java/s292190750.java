import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		int numberOfperson;//人数
		String direction;//向き
		while(true) {
			Scanner person = new Scanner(System.in);
			try{
				numberOfperson = person.nextInt();
			}catch(InputMismatchException  e) {
				System.out.println("数値を入力して下さい");
				continue;
			}
			break;
		}

		while(true) {
			Scanner dir = new Scanner(System.in);
			direction = dir.nextLine();
			Pattern p = Pattern.compile("[^sw]");
			Matcher m = p.matcher(direction);
			if(direction.length() != numberOfperson) {
				System.out.println("人数と文字数が一致しません。");
				continue;
			}else if(m.find()) {
				System.out.println("不正な文字があります。");
				continue;
			}
			dir.close();
			break;
		}
		int countW = 0;
		int countS = 0;

		for(int i = 0; i <direction.length();i++) {
			if(direction.substring(i, i + 1).equals("w")) {
				countW++;
			}else {
				countS++;
			}
		}
		if(countW <= countS) {
			System.out.println(countW);
		}else {
			System.out.println(countS);
		}
	}
}
