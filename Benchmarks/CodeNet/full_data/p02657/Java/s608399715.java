import java.util.Scanner;

public class Main{
  static void main(String args[]){
    double a = Integer.parseInt(args[1]);
    int i = 2;
    while(args[i] != null){
      a *= args[i];
      i++;
    }
    
    if(a > (10^18)){
      System.out.print(-1);
    }else{
      System.out.print(a);
    }
  }
}