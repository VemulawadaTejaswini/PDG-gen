import java.util.*;
 
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N%1000 == 0){
      System.out.println(0);
    }else if (N<=1000&&0<N){
      System.out.println(1000-N);
    }else if(1000<N&&N<10000){
      System.out.println(1000-N%1000);
    }
  }
}
