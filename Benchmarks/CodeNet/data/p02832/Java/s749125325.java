

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int now = 1;
    int cnt = 0;
    for(int i = 0; i < n; i++) {
      if(arr[i]==now) {
        now++;
        cnt++;
      }
    }
    if(cnt!=0) System.out.println(n-cnt);
    else System.out.println(-1);
  }

}
