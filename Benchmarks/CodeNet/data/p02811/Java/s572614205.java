import java.util.*;
public class Main {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int x = Integer.parseInt(sc.next);
     int y = Integer.parseInt(sc.next);
     if ( x * 500 > y) System.out.println("YES");
     else System.out.println("NO");
    }
}