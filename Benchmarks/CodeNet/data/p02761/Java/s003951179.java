import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] s = new int[m];
    int[] c = new int[m];
    int[] ans = new int[n];
    boolean[] flag = new boolean[n];
    for(int i = 0;i < m;i++){
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();      
    }
    for(int x = 1;x <= n;x++){    
      for(int j = 0;j < m;j++){
        if(s[j] == x){
          if(flag[x-1] == true && c[j] != ans[x-1]){
            System.out.println("-1");
            System.exit(0);
          }
          ans[x-1] = c[j];
          flag[x-1] = true;
        }
      }
    }
    if(ans[0] == 0 && flag[0] == false) ans[0] = 1;
    if(ans[0] == 0 && flag[0] == true && n != 1){
      System.out.println("-1");
      System.exit(0);      
    }
    if(m == 0 && n == 1) ans[0] = 0;
    if(m == 0 && n != 1) ans[0] = 1;
    for(int p = 0;p < n;p++){
      System.out.print(ans[p]);
    }
  }
}