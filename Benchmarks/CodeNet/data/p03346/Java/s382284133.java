import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k[] = new int[n];
    int j = 1;
    for (int i=0; i<n; i++) {
      k[i] = sc.nextInt();
      if (k[i] == j) {
        j++;
      }
    }
    int jj = n;
    for (int i=n-1; i>=0; i--) {
     if (k[i] == jj) {
       jj--;
     }
    }
    int ret = (n-j+1 > jj) ? jj : n-j+1;
    System.out.println(ret); 
  }
}
