
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String strmin = "zzzzzzzzzzzzzzzzzzzz";

		for(int i = 0; i < n; i++){
			String str = sc.next();

			if(str.compareTo(strmin) < 0){
				strmin = str;
			}
		}

		System.out.printf("%s\n",strmin);
	}
}