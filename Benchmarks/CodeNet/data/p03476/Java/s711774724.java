import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    for(int i = 0;i < q;i++){
      int l=sc.nextInt();
      int r=sc.nextInt();
      int cnt = 0;
      for(int j = l;j <= r;j+=2)if(sosu(j)&&sosu((j+1)/2))cnt++;
      System.out.println(cnt);
    }
  }
  public static boolean sosu(int n){
    if(n==1)return false;
    if(n==2)return true;
    if(n%2==0)return false;
    for(int i = 3;i <= Math.sqrt(n);i+=2)if(n%i==0)return false;
    return true;
  }
}