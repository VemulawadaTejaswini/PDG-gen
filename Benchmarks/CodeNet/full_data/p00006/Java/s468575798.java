import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println(reverse(sc.next()));
		sc.close();
	}
	
	static String reverse(String str) {
		char[] temp = str.toCharArray();
		char[] result = new char[temp.length];
		for(int i = 0; i < temp.length; i++) result[i] = temp[temp.length - 1 - i];
		return new String(result);
	}
}