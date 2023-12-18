import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    int ans = 0;
    for(int i=0;i<a;i++){
      b[i] = sc.nextInt();
    }
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        if(j==i){continue;}
        for(int k=0;k<a;k++){
          if(k==i || k==j){continue;}
          if(b[i]>(b[j]+b[k])){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}