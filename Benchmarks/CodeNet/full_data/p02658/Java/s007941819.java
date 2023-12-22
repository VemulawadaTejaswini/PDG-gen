import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean f = true;
    long ans = 1;
    for(int i=0; i<n; i++){
      long x = sc.nextLong();
      if(x==0){
        ans = 0;
        f = true;
        break;
      }
      else if(ans>=1000000000000000000l/x){
        f = false;
      }
      else{
        ans = ans*x;
      }
    }
    if(f==true) System.out.println(ans);
    else System.out.println(-1);

  }
}