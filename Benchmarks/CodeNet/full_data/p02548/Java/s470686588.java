import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),ans=0;
    for(int i=1;i<n;i++){
      for(int j=1;j*i<n;j++){
        ans++;
      }
    }
    System.out.println(ans);
  }
}