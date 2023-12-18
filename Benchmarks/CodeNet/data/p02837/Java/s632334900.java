import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=n;
    int[] h=new int[n];
    for(int i=0;i<n;i++){
      h[i]=1;
    }
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      for(int j=0;j<a;j++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(h[x-1]!=y){
          ans--;
        }
      }
    }
    System.out.println(ans);
  }
}