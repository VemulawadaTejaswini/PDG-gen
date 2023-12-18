import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int p[] = new int[m];
    String s[] = new String[m];
    int flg[] = new int[n];
    int pena = 0;
    int ac = 0;
    
    if(m==0){
      System.out.println("0 0");
      return;
    }
    
    for(int i=0; i<n; i++){
      flg[i] = 0;
    }
    
    for(int i=0; i<m; i++){
      p[i] = Integer.parseInt(sc.next());
      s[i] = sc.next();
    }
    
    for(int i=0; i<m; i++){
      if(flg[p[i]-1]==1){
        continue;
      }
      if(s[i].equals("AC")){
        flg[p[i]-1] = 1;
        ac += 1;
      } else if(s[i].equals("WA")){
        pena += 1;
      }
    }
    
    System.out.println(ac + " " + pena);
  }
}

