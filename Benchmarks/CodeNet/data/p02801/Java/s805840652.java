import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String C = sc.next();
    String A = "abcdefghijklmnopqrstuvwxyz";
    int idx = A.indexOf(C);
    System.out.println(A.substring(idx+1,idx+2));
  }
}
