import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[];
      int sum = 0;
      for(int i = 0;i < n;i++){
      	array[i] = sc.nextInt();
        sum += array[i];
      }
      for(int i = 1;i < n;i++){
      	array[i] = Math.max(array[i],array[i-1]);
      }
      if(array[i] < sum){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
    }
}