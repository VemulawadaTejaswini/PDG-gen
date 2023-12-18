import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int j = 1;
    int pos = 1;
    int maxLength = 0;
    int k[] = new int[n];
    for (int i=0; i<n; i++) {
      k[i] = sc.nextInt();
    }

    while (j<=n) {
      int tmp = 0;
      for (int i=0; i<n; i++) {
        if (k[i] == j) {
          j++;
        }
      }
      if (j-pos > maxLength) {
        maxLength = j-pos;
      }
      pos = j;
    }
    System.out.println(n-maxLength); 
  }
}