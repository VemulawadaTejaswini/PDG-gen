import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int couint = 0;
    for(int j = 0; j < n; j++){
      int b = 0;
      for(int i = 0; i < n; i++){
        b += a[i];
        if(b == 0)
          count++;
      }
    }
    System.out.println(count);
  }
}