import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String ret = "";
		
		for (int i=0; i<s.length(); i++){
			if (s.substring(i, i+1).equals("1")){
				ret += "9";
			} else {
				ret += "1";
			}
		}
		System.out.println(ret);
	}
}