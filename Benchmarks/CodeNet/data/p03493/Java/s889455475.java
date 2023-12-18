import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.close();
		System.out.println(count(s1));
	}
	
	private static int count(String str){
		char[] array = str.toCharArray();
		int c = 0;
		if(array[0] == '1') c++;
		if(array[1] == '1') c++;
		if(array[2] == '1') c++;
		
		return c;
	}

}