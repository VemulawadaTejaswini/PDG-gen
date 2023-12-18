import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[] a = new int[26];
    for(int i = 0; i<H; i++) {
      String s = sc.next();
      for(int j = 0; j < W; j++) {
        char c = s.charAt(j);
        a[c - 'a']++;
      }
    }

    int num = (H / 2) * (W / 2);
    int num2 = H * W - (num * 4);

    for(int i =0; i<26; i++){
      if(num == 0) break;
      while(a[i] >= 4) {
        a[i] = a[i] - 4;
        num--;
        if(num == 0) break;
      }
    }
    if(num != 0){
      System.out.println("No");
      return;
    }

    for(int i =0; i<26; i++){
      if(num2 < 2) break;
      while(a[i] >= 2) {
        a[i] = a[i] - 2;
        num2 = num2 - 2;
        if(num2 < 2) break;
      }
    }

    if(num2 >= 2) System.out.println("No");
    else System.out.println("Yes");
  }
}
