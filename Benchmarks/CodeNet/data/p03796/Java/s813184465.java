import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = 1;
      int k = (int)Math.pow(10,9)+7
      for(int i = 1;i <= n;i++){
      	m = (m*i)%k;
      }
      System.out.println(m);
    }
}