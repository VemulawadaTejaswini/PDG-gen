import java.util.*;

class Main{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int H = x / 3600;
    int M = x % H / 60;
    int S = x % H % M;

    System.out.println(H + ":" + M + ":" + S);
    sc.close();
  }
}