import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int r = stdIn.nextInt();
    int g = stdIn.nextInt();
    int b = stdIn.nextInt();
    int n = stdIn.nextInt();
    int count = 0;
    for(int i = 0;i<=3000;i++) {
      int u = r*i;
      if(u>n) break;
      if(u==n) break;
      for(int j = 0;j<=3000;j++) {
        u += g*j;
        if(u>n) break;
        if(u==n) break;
        for(int k = 0;k<=3000;k++) {
          int u += b*k;
          if(u>n) break;
          if(u==n) count+=1;
        }
      }
    }
    System.out.println(count);
 }
}