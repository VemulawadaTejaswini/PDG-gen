import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int k = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int min = x - (k-1);
      int max = x + (k-1);
      for(int n=min; n<=max; n++) {
      	System.out.println(n + " ");
      }
    }
}