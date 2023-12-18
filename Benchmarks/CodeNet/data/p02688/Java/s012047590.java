import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] sunuke = new int[n];
    for (int i = 0; i<k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j<d; j++) {
        int idx = sc.nextInt();
        sunuke[idx-1]+=1;
      }
    }
    int ans = 0;
    for (int i : sunuke) {
      if (i==0) ans++;
    }
    System.out.println(ans);
  }
}
