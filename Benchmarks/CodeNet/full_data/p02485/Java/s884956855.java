import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			String value = sc.next();
			if(value.charAt(0) == '0') break;
			int sum = 0;
			int ch;
			for(int i=0; i<value.length(); i++){
				ch = value.charAt(i);
				sum += ch -'0';
			}
		}

	}
}