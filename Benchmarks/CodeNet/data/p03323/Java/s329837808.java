import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		String msg = "";

		if(a <= 8 && b <= 8){
			msg = "Yey!";
		} else {
			msg = ":(";
		}

		System.out.println(msg);
	}
}
