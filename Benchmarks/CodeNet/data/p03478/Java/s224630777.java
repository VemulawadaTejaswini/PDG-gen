import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int n4, n3, n2, n1,n;
    int count =0;
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i=0; i<N+1; i++) {
      n4 = i / 1000;
      n3 = i / 100 - n4*10;
      n2 = i / 10 - n4*100 - n3*10;
      n1 = i % 10;
      n = n1+n2+n3+n4;
      if(n>=A && n<=B) {
        count += i;
      }
    }
    System.out.println(count);
  }
}