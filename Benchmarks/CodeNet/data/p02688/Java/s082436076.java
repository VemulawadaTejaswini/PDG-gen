import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var N = scanner.nextInt();
    var K = scanner.nextInt();
    var candy = new int[N+1];
    candy[0] = 1;
    for(int i = 1; i <= K; i++) {
    	var d = scanner.nextInt();
	    	for(int j = 1; j <= d; j++) {
          	var x = scanner.nextInt();
          	candy[x]++;
        }
    }
    long target = (Arrays.stream(candy).filter(t -> t==0).count();
	System.out.println(target);
  }
}
