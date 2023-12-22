import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		if(str.charAt(n-1)!='s') {
			str=str+'s';
		}else if(str.charAt(n-1)=='s') {
			str=str+"es";
		}
		System.out.println(str);
		
	}

}
