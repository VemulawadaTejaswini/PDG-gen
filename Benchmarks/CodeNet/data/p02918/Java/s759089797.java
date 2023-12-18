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
    int chk = 0;
    
    for (int i=0; i<n; i++) {
      c = s.substring(i,i+1);
      d[i] = (c.equals("L")) ? -1 : 1;
    }
    d[n] = 0;
    
    chk = d[0] == 1 ? -1 : 1;
    
    for (int i=0; i<n+1; i++) {
      if(d[i] == chk){
        for(int j=i; j<n+1; j++){
          if(d[j] == chk) {
            same++;
          } else {
            for (int jj=0; jj<same; jj++){
              d[i+jj] = -1 * chk;
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
    }
    
    System.out.println(ans);
  }
}
