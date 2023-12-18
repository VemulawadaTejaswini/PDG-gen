import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		String result = "";
		for(char c: in.toCharArray()) {
			switch(c){
			case '1':
				result += "9";
				break;
			case '9':
				result += "1";
				break;
			}
		}
		System.out.println(result);

	}

}
