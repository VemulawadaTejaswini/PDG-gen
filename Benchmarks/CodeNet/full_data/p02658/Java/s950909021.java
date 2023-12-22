import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean f = true;
    long ans = 1;
    for(int i=0; i<n; i++){
      ans = ans * sc.nextLong();
      if(ans>=Math.pow(10, 18)){
        f = false;
      }
    }
    if(f==true) System.out.println(ans);
    else System.out.println(-1);

  }
}