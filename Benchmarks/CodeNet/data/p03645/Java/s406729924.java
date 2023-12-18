import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int a[] =new int[m];
    int b[] =new int[m];
    int st[] = new int[m];
    int en[] = new int[m];
    boolean ju = false;
    int stn = 0;
    int enn = 0;
    
    for(int i = 0 ; i < m ; ++i){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      if(a[i]==1){
        st[stn] = i;
        stn++;
      }
      if(b[i]==n){
        en[enn] = i;
        enn++;
      }
    }

    for(int i = 0 ; i < enn ; ++i){
      int mid = a[en[i]];
      for(int j = 0 ; j < stn ; ++j){
        if(mid==b[st[j]]){
          ju = true;
          break;
        }
      }
    }
    
    if(ju) System.out.println("POSSIBLE");
    else System.out.println("IMPOSSIBLE");

  }
}