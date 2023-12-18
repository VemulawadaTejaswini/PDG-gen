import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String get = sc.nextLine();
		sc.close();
		String def = "CODEFESTIVAL2016";

		int wrongCount = 0;
		for(int i=0;i<def.length();i++){
			if(get.charAt(i)!=def.charAt(i)) wrongCount ++;
		}
		System.out.println(wrongCount);

	}

}