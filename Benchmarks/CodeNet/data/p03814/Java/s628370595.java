import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		boolean start = false;
		int startNum = 0;
		int finishNum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(start == false && s.substring(i, i + 1).equals("A")){
				start = true;
				startNum = i;
			}
			if(start == true && s.substring(i, i + 1).equals("Z")) {
				finishNum = i;
			}
		}
		System.out.println(finishNum - startNum + 1);
		scan.close();

	}

}
