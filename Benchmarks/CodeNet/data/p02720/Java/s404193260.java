import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
  public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    
    ArrayList<Long> arr = new ArrayList<>();
    
    for (long i = 1; i <= 9; i++) {
      arr.add(i);
      keisan(i,arr);
    }
    Collections.sort(arr);
    System.out.println(arr.get(K-1));
    sc.close();
  }
  public static void keisan(long K,ArrayList<Long> arr){
    long max = 100000000000L;
    if (K<max) {
      
    
      if(K%10>=1){
        long minus = K*10+(K%10)-1;
        arr.add(minus);
        keisan(minus,arr);

      }
        long same = K*10+K%10;
        arr.add(same);
        keisan(same,arr);

      if(K%10<9){
        long plus = K*10+K%10+1;
        arr.add(plus);
        keisan(plus,arr);
        
      }
    }
  }	

}