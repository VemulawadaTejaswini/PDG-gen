import java.util.Scanner;

public class Main {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
    int sum = 0;
 
    
    int v[] = new int[N];
    int c[] = new int[N];
    
    
    for (int i = 1; i <= N; i++) {
  		v[i-1] = sc.nextInt();
	}
    
    for (int i = 1; i <= N; i++) {
  		c[i-1] = sc.nextInt();
	}
    
    for (int i = 1; i <= N; i++) {
      int rev = v[i-1] - c[i-1];
      if(rev > 0){
        sum = sum + rev;
      } else {
        sum = sum + 0;
      }
	}
    
      System.out.println(sum);

  }
}