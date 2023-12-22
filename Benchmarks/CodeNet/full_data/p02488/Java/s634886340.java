import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String result = "" + (char)('z' + 1);
		for(int i = scn.nextInt(); i-- > 0;){
			String temp = scn.next();
			System.out.println(result + "と" + temp + "の比較");
			result = (result.compareTo(temp) > 0 ? temp : result);
		}
		System.out.println(result);
	}

}