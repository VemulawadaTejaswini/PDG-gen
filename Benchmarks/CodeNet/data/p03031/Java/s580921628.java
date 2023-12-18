import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int[] k = new int[m];
    int[][] s = new int[m][];
    int[] p = new int[m];
    for(int i=0;i<m;i++){
      k[i] = Integer.parseInt(sc.next());
      s[i] = new int[k[i]];
      for(int j=0;j<k[i];j++){
        s[i][j] = Integer.parseInt(sc.next())-1;
      }
    }
    for(int i=0;i<m;i++){
      p[i] = Integer.parseInt(sc.next());
    }
    int res = 0;
    outer:for(int i=0;i<(1<<n);i++){
      for(int j=0;j<m;j++){
        int count = 0;
        for(int l=0;l<k[j];l++){
          if(((i>>s[j][l]) & 1)==1){
            count++;
          }
        }
        if(count%2!=p[j]){
          continue outer;
        }
      }
      res++;
    }
    System.out.println(res);
    
  }
}
