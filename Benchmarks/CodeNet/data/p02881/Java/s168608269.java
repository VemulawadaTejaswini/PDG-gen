import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
    long before = N+1;
    long X = 1;
    for(long i = N/2; i > 0; i--){
      if(N%i == 0 && (N/i)+i < before){
        X = i;
        before = (N/i)+i;
      }
    }
    System.out.println((X-1)+(N/X-1));
	}
}