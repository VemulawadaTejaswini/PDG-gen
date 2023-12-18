import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int length = Integer.parseInt(sc.next());
    int c = 0;
    int[] arr = new int[length];
    for (int i = 0; i < length; i++) {
      arr[i] = Integer.parseInt(sc.next());
      int min = arr[i];
      int v =0;
      for (int j = 0 ; j <= i; j++) {
          v = arr[j];
          if (v < min) {  
          min = v;
          }
      }
      if(min == v){
          c++;
          }
    }
    System.out.println(c);
    }    
}