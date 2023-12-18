import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i] = sc.nextInt();
      int count = 0;
      int point = 1;
      for(int i = 0;i <= n;i++){
      	point = a[point];
        count++;
        if(point == 2){
          System.out.println(count);
          return;
        }
      }
      System.out.println(-1);
    }
}
