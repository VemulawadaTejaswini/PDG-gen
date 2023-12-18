import java.util.*;
import java.lang.*;

public class Main {
  static boolean isPrime(int X){
    if(X <= 1) return false;
    
    for(int i = 2; i * i <= X; i++){
      if(X % i == 0) return false;
    }
    
    return true;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    
    while(!isPrime(X)){
      X++;
    }
    
    System.out.println(X);
  }
}
