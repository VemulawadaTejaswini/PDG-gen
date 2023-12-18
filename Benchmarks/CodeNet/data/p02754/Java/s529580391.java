import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
if (a+b== 0){
    System.out.println(0);

  return;
}
    int ans = 0;
    int mod = 0;
    ans = n / (a+b);
    mod = n % (a+b);
    ans=ans * a;
    if (mod <= a) {
    	ans+=mod;
    } else{
    	ans+=a;
    }
    System.out.println(ans);
  }
}


