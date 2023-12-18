import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		int num = 0;
		
		for (int i = 0; i < n.length();i++){
			if(n.charAt(i) == '1')
				num += 9 * Math.pow(10, 2 - i);
			else
				num += Math.pow(10, 2 - i);
		}
		
		System.out.println(num);

	}

}
