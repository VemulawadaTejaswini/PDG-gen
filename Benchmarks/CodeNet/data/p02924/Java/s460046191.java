import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = n-1;
    int ans = 0;
    
    for(int i=n; i>1; i--){
      ans += x%i;
      x--;
    }
    ans += n%1;
    System.out.println(ans);
  }
}