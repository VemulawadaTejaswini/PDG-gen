import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = scan.next();
		String result = "";
		
		
		for(int i = 0; str.length() > i; i = i + 2){
			sb.append(str.charAt(i));
		}
		System.out.println(result);
		scan.close();
	}

}