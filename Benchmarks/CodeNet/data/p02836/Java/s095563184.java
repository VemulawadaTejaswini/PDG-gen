import java.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int Count = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		if(length%2 == 0) {
			for(int i = 0; i <= length/2-1; i++) {
				if(str.charAt(i) != str.charAt(length-1-i)) {
					Count++;
				}
			}
		}else {
			for(int i = 0; i <= (length-1)/2-1; i++) {
				if(str.charAt(i) != str.charAt(length-1-i)) {
					Count++;
				}
			}
		}
		System.out.println(Count);
	}
}