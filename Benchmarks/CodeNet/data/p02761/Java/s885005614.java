import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int s[] = new int[m];
    int c[] = new int[m];
    int d[] = new int[n];
    boolean out = false;
    
    for(int i=0; i<m; i++){
      s[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
      d[s[i]-1]++;
    }
    
    int temp = -1;
    for(int i=0; i<n; i++){
      temp = -1;
      if(d[i] > 0){
        for(int j=0; j<m; j++){
          if(s[j] == i+1 && temp == -1) { temp = c[j]; }
          if(s[j] == i+1 && temp != -1) { 
            if(temp != c[j]) { out = true; }
          }
        }
      }
    }
    
    if(out) { System.out.println("-1"); return; }
    
    for(int i=0; i<n; i++){
      d[i] = -1;
    }
    
    switch(n){
      case 1:
        for(int i=0; i<m; i++){
          if(s[i] == 1 && c[i] != 0) { 
            temp = c[i]; 
          } else {
            temp = 0;
          }
        }
        System.out.println(temp);
        return;
      case 2:
        for(int i=0; i<m; i++){
          d[s[i]-1] = c[i];
        }
        if(d[0]==0) {
          System.out.println("-1");
          return;
        }
        for(int i=0; i<n; i++){
          if(d[i]==-1){
            d[i] = 0;
          }
        }
        System.out.println(d[0]*10 + d[1]);
        return;
      case 3:
        for(int i=0; i<m; i++){
          d[s[i]-1] = c[i];
        }
        if(d[0]==0) {
          System.out.println("-1");
          return;
        }
        for(int i=0; i<n; i++){
          if(d[i]==-1){
            d[i] = 0;
          }
        }
        System.out.println(d[0]*100 + d[1]*10 + d[2]);
        return;
    }
    
  }
  
}
