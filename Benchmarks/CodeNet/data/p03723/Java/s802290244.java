import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int cnt = 0;
    boolean find = false; 
    for(int i=0; i<100000; i++) {
      if(A%2==0 && B%2==0 && C%2==0) {
      int a = A;
      int b = B;
      int c = C;
      a = (b/2) + (c/2);
      b = (a/2) + (c/2);
      c = (a/2) + (b/2);
      A = a;
      B = b;
      C = c;
      cnt++;
      } else {
        find = true;
        break;
      }
    }
    System.out.println(find == false?-1:cnt);
  }
}
      