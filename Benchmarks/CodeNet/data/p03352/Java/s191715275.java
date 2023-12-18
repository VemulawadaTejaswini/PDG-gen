import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ans = 1;
    
    for(int i=2;i<=x;i++){
      for(int j=1;j<=x;j++){
          ans = (int)Math.pow(i,j);
        if(ans>=x){
          break;
        }
      }
    }
    System.out.println(ans);
  }
}