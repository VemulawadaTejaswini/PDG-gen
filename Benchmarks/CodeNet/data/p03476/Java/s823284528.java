import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    int[] s = new int[100001];
    for(int i = 1;i<=100000;i++){
      if(sosu(i)&&sosu((i+1)/2))s[i]=s[i-1]+1;
      else s[i]=s[i-1];
    }
    for(int i = 0;i < q;i++){
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(s[r]-s[l-1]);
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
