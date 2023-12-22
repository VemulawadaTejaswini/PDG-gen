import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int count = 0;

     for(int i=0;i<n;i++){
       int d = scanner.nextInt();
       if(primecheck(d))count++;
     }
     System.out.println(count);
  }

  static boolean primecheck(int d){
    if(d==1)return false;
    for(int i=2;i<d-1;i++){
      if(d%i==0)return false;
    }
    return true;
  }

}
