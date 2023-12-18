import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long C = Long.parseLong(sc.next());
    long D = Long.parseLong(sc.next());
    long ans = 0;

    for(long i = A; i <= B; i++) {
    	if(i % C != 0 && i % D != 0) {
    		ans++;
    	}
    }
    System.out.println(ans);
  }
}