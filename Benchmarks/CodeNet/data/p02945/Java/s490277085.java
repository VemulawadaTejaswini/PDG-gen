import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int add = A+B;
    int sub = A-B;
    int acc = A*B;
    int ans = Math.max(add,Math.max(sub,acc));
    System.out.println(ans);
    sc.close();
  }
}