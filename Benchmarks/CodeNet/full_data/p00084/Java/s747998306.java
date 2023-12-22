
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s = sc.nextLine();
			String[] str = s.split("[ ,.]");	//空白と,.でsplit
			int cnt = 0;
			for(int i=0;i<str.length;i++) {
				String a = str[i];
				if(2 < a.length()  && a.length() < 7) {
					if(cnt ==0) {
						System.out.print(a);
						cnt++;
					}
					else System.out.print(" " + a);
				}
			}
			System.out.println();
		}
	}
}

