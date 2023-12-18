import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long a = 0, b = 0;
    if(B%2 == 0){
      a = b = B/2;
    }else{
      a = (B+1)/2;
      b = a-1;
    }
    
    long c = 0, d = 0;
    if(A%2 == 0){
      c = d = A/2;
    }else{
      d = A/2;
      c = d+1;
    }
    
    System.out.println(a*c + b*d);
  }
}