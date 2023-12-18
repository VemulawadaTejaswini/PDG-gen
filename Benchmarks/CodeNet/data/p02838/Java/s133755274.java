import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
		  a[i] = sc.nextLong();
        }
        
        long sum = 0;
      
        for (int i = 1; i <= n - 1; i++) {
          for (int j = i + 1; j <= n; j++) {
            sum += (a[i-1] % 34359738368L) ^ (a[j-1] % 34359738368L);
          }
        } 

      System.out.println(sum % 1000000007);
	}
}