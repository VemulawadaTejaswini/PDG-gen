import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static String input=sc.nextLine();
	private static ArrayList<String> result=new ArrayList<String>();
	public static void main(String[] args){
		for(int i=0;i<input.length();i++){
			char c=exchanger(input.charAt(i));
			result.add(String.valueOf(c));
		}
		for(int i=0;i<result.size();i++){
			System.out.print(result.get(i));
		}
		System.out.println("");
	}
	private static char exchanger(char x){
		if(Character.isUpperCase(x)) return Character.toLowerCase(x);
		if(Character.isLowerCase(x)) return Character.toUpperCase(x);
		else return x;
	}
}