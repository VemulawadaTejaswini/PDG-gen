import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int input= scanner.nextInt();
		int input2 = scanner.nextInt();
		String enz = input>input2 ? " > " : input==input2 ? " == " : " < ";
		System.out.println(Integer.toString(input)+enz+Integer.toString(input2));
		scanner.close();
	}
}