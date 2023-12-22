import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	String[] s = new String[n];
    	for(int i = 0 ; i < n ; i++){
    		s[i] = input.next();
    	}
    	Arrays.sort(s);
    	System.out.println(s[0]);
    }
}