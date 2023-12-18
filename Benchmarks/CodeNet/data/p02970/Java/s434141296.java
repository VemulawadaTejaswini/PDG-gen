import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double N =  sc.nextInt();
    double D =  sc.nextInt();
    D += D+1;
    System.out.println((int)Math.ceil(N/D));
  }
}