import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    double N = Double.parseDouble(sc.next());
	int takahashi = 100;
    int count = 0;

    while(true) {
    	if(takahashi>=N) {
    		System.out.println(count);
    		break;
    	}
    	takahashi = (int) (takahashi * 1.01);
    	count++;
    }
  }
}