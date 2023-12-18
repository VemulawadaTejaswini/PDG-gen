import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.next();
		
		int index = 0;
		
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i)=='2') {
				index++;
			}
		}
		System.out.println(index);
	}
}
