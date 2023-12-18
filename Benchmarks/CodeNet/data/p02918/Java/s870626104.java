import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    String s = sc.next();
    String c = "";
    int d[] = new int[n+1];
    int cnt = 0;
    int same = 0;
    int ans = 0;
    int ss = 0;
    
    for (int i=0; i<n-1; i++) {
      c = s.substring(i,i+1);
      d[i] = (c.equals("L")) ? -1 : 1;
    }
    d[n] = 0;
    
    for (int i=0; i<n+1; i++) {
      if(d[i] == 1){
        for(int j=i; j<n+1; j++){
          if(d[j] == 1) {
            same++;
          } else {
            for (int jj=0; jj<=same; jj++){
              d[i+jj] = -1;
            }
            i += same;
            same = 0;
            cnt++;
            break;
          }
        }
        if(cnt == k) {
          same = 0;
          break;
        }
      }
    }

    for (int i=1; i<n+1; i++) {
      if(d[i] == d[i-1]){
        same++; 
      } else {
        ans += same;
        same = 0;
      }
      //System.out.print(d[i] == -1 ? "L" : "R");
    }
    
    System.out.println("\n"+ans);
  }
}
