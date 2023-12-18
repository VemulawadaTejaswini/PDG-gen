import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    long cnt = 0;
    long max = 0;
    boolean flag = true;

    for(int i = 0; i < N; i++) {
    	cnt += Long.parseLong(sc.next());
    	max = Math.max(max, Long.parseLong(sc.next()));
    	if(cnt <= max) {
        	flag = true;
        } else {
        	flag = false;
        }
    }

    if(flag) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
  }
}