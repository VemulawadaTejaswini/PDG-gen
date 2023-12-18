import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int k = sc.nextInt();
      int cnt = 0;
      int ans = -1;
      for(int i = 1; i <= 100; i++){
      	if ( a % i == 0 && b % i == 0)
          cnt++;
          if (cnt == k){
            ans = i;
            break;
          }
      }
      System.out.println(ans);
    }	
}
