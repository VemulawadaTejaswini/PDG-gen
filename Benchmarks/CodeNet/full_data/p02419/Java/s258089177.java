import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String W = scan.next();
		String end = "END_OF_TEXT";
		int tmp = 0;

		for(;;){
			String T = scan.next();
			if(T.equals(end)){
				break;
			}else if(T.equalsIgnoreCase(W)){
				tmp++;
			}
		}
		System.out.println(tmp);
	}

}