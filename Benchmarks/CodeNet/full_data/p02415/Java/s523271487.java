import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j;
    	
    	String moji = sc.nextLine();
    	
    	for(char c : moji.toCharArray()) {
    		if('A' <= c && 'Z' >= c) {
    			System.out.print(Character.toLowerCase(c));
    		}
    		else if('a' <= c && 'z' >= c) {
    			System.out.print(Character.toUpperCase(c));
    		}
    		else {
    			System.out.print(c);
    		}
    	}
    	System.out.println();
    }
}
