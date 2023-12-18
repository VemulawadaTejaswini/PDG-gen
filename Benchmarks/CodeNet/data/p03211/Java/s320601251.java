import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int[] array = new int[str.length()+10];
      int min = 0;
      for(int i = 0;i<str.length()-2;i++){
      	array[i] = Integer.parseInt( str.substring(i,i+3) );
        min = Math.min(max,Math.abs(array[i]-753));
      }
      System.out.println(min);
    }
}