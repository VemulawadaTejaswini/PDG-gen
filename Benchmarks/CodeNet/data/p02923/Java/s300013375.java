import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] h = new int[n];
      int count = 0;
      int max = 0;
      for(int i = 0;i < n;i++) h[i]=sc.nextInt();
      for(int i = 1;i < n;i++){
      	if(h[i-1] >= h[i])count++;
        else{
          max = Math.max(count,max);
          count = 0;
        }
      }
      max = Math.max(count,max);
      System.out.println(max);
    }
}