import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		String W = scanner.next().toLowerCase();	//computer
		String temp;
		int count = 0;
		while(!(temp=scanner.next()).equals("END_OF_TEXT")) {	//读取下一字段直到字段为END_OF_TEXT
			if (temp.toLowerCase().equals(W)) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
