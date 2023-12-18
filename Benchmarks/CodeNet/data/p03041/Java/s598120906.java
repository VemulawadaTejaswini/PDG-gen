import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    char[] c = new char[n];

    for(int i = 0;i < n;i++) {
      c[i] = s.charAt(i);
    }

    if(c[k-1] == 'A') c[k-1] = 'a';
    if(c[k-1] == 'B') c[k-1] = 'b';
    if(c[k-1] == 'C') c[k-1] = 'c';

    for(int i = 0;i < n;i++)
    System.out.print(c[i]+" ");

  }

}