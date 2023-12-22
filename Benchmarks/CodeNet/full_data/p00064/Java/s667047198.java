import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNext()){
			String str = sc.nextLine();
			int i = 0;
			int tmp = 0;
			while(i<str.length()){
				char ch = str.charAt(i++);
				if( '0' <= ch && ch <= '9' )
					tmp = tmp * 10 + Integer.parseInt(""+ch);
				else {
					sum += tmp;
					tmp = 0;
				}
			}
			sum += tmp;
		}
		System.out.println(sum);
	}
}