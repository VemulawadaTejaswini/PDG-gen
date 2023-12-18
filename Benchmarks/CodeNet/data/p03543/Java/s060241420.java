import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

	private static Scanner sc;

public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        String s=Integer.toString(n);
        char ch=s.charAt(0);
        char ch1=s.charAt(1);
        char ch2= s.charAt(2);
        
        if((ch==ch1) && (ch2==ch)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        
        

	}

}
