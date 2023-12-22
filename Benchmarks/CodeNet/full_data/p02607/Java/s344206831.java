import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int[][] arr = new int[n][2];
    int ans=0;
    for(int i=0;i<n;i++){
      int a =sc.nextInt();
      if(a%2!=0 && (i+1)%2!=0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
