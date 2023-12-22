import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int T = sc.nextInt();
    int S = sc.nextInt();
    double dD = D;
    double dS = S;
    if(dD/dS>T){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}