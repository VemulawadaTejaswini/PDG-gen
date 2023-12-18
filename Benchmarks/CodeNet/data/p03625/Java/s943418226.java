import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long hen1 = 0;
    long hen2 = 0;
    for(int i = a.length-1; i >= 1; i--){
      if(a[i] == a[i-1]){
        if(hen1 == 0){
          hen1 = a[i];
          i--;
        }else{
          hen2 = a[i];
          break;
        }
      }
    }
    System.out.println(hen1 * hen2);
  }
}
