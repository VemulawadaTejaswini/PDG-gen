import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] l = new int[n];
      int[] r = new int[n];
      int max = 0;
      int min = 1000000;
      for(int i = 0;i < n;i++){
      	l[i] = sc.nextInt();
        max = Math.max(max,l[i]);
        r[i] = sc.nextInt();
        min = Math.min(min,r[i]);
      }
      if(min < m)System.out.println(max-min+1);
      else if(m < max)System.out.println(0);
      else System.out.println(n-max+1);
    }
}