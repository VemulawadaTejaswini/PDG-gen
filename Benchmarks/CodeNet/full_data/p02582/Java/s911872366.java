import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.indexOf("RRR") != -1) {
			System.out.println("3");
		}else if(s.indexOf("RR") != -1){
			System.out.println("2");
		}else if(s.indexOf("R") != -1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}