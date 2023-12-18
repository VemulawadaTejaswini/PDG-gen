import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] standard = "CODEFESTIVAL2106".toCharArray();
		char[] i_ca = input.toCharArray();
		int count = 0;
		for(int i=0;i<16;i++){
			if(standard[i]!=i_ca[i])
				count++;
		}
		System.out.println(count);
	}

}