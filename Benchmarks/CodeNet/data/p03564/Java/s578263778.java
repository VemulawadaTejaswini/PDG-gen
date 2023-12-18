import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = 1;
      int k = sc.nextInt();
      int count = 0;
      while(m <= k && count < n){
      	m = m*2;
        count++;
      }
      while(count < n){
      	m = m+k;
        count++;
      }
      System.out.println(m);
    }
}
