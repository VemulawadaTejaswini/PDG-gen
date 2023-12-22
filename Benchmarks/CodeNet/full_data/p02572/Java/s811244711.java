import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	long as[] = new long[n];
      	long md = 1000000007;
      	long sum = 0;
      
      	for(int i = 0;i < n;i++) as[i] = sc.nextLong();
      	for(int i = 0;i < n-1;i++){
          for(int j = i+1;j < n;j++){
            sum += as[i]*as[j];
          }
          sum %= md;
        }
      
      	System.out.println(sum);
	}
}
