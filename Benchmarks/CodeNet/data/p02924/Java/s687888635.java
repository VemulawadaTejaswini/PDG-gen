import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int N=sc.nextInt();
    long res =0;
    res = N*(N-1)/2;
    System.out.println(res);
  }
}