import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int firstLength = s.length();

		for(int i = 0;i < firstLength;i++) {
			if(s.indexOf("01") != -1){
				s.replaceAll("01","");
			}else if(s.indexOf("10") != -1){
				s.replaceAll("10","");
			}else{
				break;
			}
		}
		int lastLength = s.length();

		System.out.println(firstLength - lastLength);

	}
}