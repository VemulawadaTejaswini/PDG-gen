import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if((existChar(str, 'N') == existChar(str, 'S')) && (existChar(str, 'W') == existChar(str, 'E'))){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	static boolean existChar(String str, char ch){
		for(char c : str.toCharArray()){
			if(c == ch){
				return true;
			}
		}
		return false;
	}
}
