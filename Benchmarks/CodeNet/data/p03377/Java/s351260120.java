import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      	int x = Integer.parseInt(sc.next());
      	
      	if (a <= x && (x - a) <= b) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }
}
