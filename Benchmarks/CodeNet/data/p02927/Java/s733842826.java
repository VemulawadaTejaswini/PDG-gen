import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String M = sc.next();
    String D = sc.next();
    
    int mm = Integer.parseInt(M);    
    int dd = Integer.parseInt(D);

    int d1 = dd / 10;
    
    int count = 0;
    
    for(int m1 = 0; m1 <= mm; m1++){
    for(int i = 2; i <= d1 ; i++){
      for(int n = 2 ; n <= 9; n++){
        int total = i*10 + n;
        int f = (i * n);
        
        if(f == m1 && total < dd){

          count++;
        }
      }
    }
    }
    System.out.println(count);
  }
  
}