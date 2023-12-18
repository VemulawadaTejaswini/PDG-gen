
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if (a >= d || b <= c) {
        	System.out.println(0);
        } else {
        	int s = Math.max(a, c);
        	int e = Math.min(a, b);
        	System.out.println(e - s);
        }
    }
}