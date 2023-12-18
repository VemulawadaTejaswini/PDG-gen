import java.util.*;

public class Main{
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }

    int a = array[0];
    int b = array[n-1];
    int ans =0;
    int max_ans = 0;
    int pp;
    int ss;

    int[] l_gcd = new int[n];
    l_gcd[0] = array[0];
    for(int i=1; i<n-1; i++){
      l_gcd[i] = gcd(l_gcd[i-1],a[i]);
    }

    int[] r_lcd = new int[n];
    r_lcd[n-1] = a[n-1];

    for(int i=n-2; i>0; i--){
      r_lcd[i] = gcd(r_lcd[i+1],a[i]);
    }
    for(int i=0; i<n-2; i++){
      ans = gcd(l_gcd[i],r_lcd[i+2]);
      if(ans>max_ans){
        max_ans = ans;
      }
    }
    System.out.println(max_ans);






  }
}