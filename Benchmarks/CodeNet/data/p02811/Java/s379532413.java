import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    String R = "No";
    if(K*500>=X){
      R = "Yes";
    }
    System.out.println(R);
  }
}