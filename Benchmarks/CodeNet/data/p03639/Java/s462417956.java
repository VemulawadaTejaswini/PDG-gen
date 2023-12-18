import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int total = n;
    int ok = 0;
    int two = 0;
    for(int i = 0;i<n;i++){
      int a = sc.nextInt();
      if(a%4==0){
        ok++;
      }else if(a%2==0){
        if(two==0){
          two++;
        }else{
          two=0;
          total-=2;
        }
      }
    }
    total-=ok;
    if(ok>=total-1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
