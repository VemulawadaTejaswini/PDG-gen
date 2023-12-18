import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int max = 0;
      int min = 1000000001;
      int[] array = new int[n];
      for(int i = 0;i < n;i++){
      	array[i] = sc.nextInt();
        max = Math.max(max,array[i]);
        min = Math.min(min,array[i]);
      }
      System.out.println(max-min);
    }
}
