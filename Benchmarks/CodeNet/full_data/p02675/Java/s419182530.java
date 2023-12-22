import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner input = new Scanner(System.in)){
			String testCase = input.nextLine();
			solution(testCase);
		}
	}
	public static void solution(String str){
		String onesDigit = str.substring(str.length()-1);
		int x = Integer.parseInt(onesDigit);
		if (x==2||x==4||x==5||x==7||x==9){
			System.out.println("hon");
		}
		if (x==0||x==1||x==6||x==8){
			System.out.println("pon");
		}
		if (x==3){
			System.out.println("bon");
		}
	}
}
