import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[n];
      for(int i = 0;i < array.length;i++){
      	array[i] = sc.nextInt();
      }
      int s1 = 0;
      int s2 = 0;
      for(int i = 0;i < array.length;i++){
      	s2 += array[i];
      }
      
      int count = 0;
      for(int i = 0;i < array.length;i++){
      	if(s1 < s2){
          s1 += array[i];
          s2 -= array[i];
          count++;
        }
      }
      System.out.println(Math.min(s1-s2-array[count-1],Math.min(Math.abs(s1-s2),Math.abs(s1-s2+array[count]*2))));
    }
}
