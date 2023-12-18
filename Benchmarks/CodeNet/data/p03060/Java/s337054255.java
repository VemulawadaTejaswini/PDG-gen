import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] v = new int[n];
      int[] c = new int[n];
      int count = 0;
      for(int i = 0;i < n;i++){
      	v[i] = sc.nextInt();
      }
      for(int i = 0;i < n;i++){
      	c[i] = sc.nextInt();
        v[i] -= c[i];
        if(v[i] >= 0) count += v[i];
      }
      System.out.println(count);
      
      
    }
}