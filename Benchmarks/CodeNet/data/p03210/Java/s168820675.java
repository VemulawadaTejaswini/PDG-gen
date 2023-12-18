import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if (y % 3 == 0 || y % 5 == 0 || y % 7 == 0) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
	}
}
