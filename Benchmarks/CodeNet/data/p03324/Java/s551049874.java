import java.util.*;

class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    double n,ans;
    d = sc.nextInt();
    n = sc.nextInt();
    ans = Math.pow(100,d);
    if(d==0){
      System.out.println(n);
    }
    else{
      System.out.println(ans*n);
    }
    
  }
  
}
