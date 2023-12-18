import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] ss = new String[s.length()];
		ss = s.split("");
		String result = "";
		for(String f : ss){
			result+="x";
		}
		System.out.println(result);
	}

}
