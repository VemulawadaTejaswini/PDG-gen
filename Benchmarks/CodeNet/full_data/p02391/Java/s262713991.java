import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lines = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(lines[0]);
		int num2 = Integer.parseInt(lines[1]);
		String kigou;
		if(num1 < num2){
			kigou = "<";
		} else if(num1 > num2) {
			kigou = ">";
		} else {
			kigou = "==";
		}

		System.out.println(num1 + " " + kigou + " " + num2);

	}
}