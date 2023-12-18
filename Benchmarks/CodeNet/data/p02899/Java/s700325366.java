import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    int[] ans = new int[a];
    for(int i=0;i<a;i++){
      b[i] = sc.nextInt();
    }
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        if(b[j]==(i+1)){
          ans[i] = j;
        }
      }
    }
    for(int i=0;i<a;i++){
      System.out.println(ans[i]+1);
    }
  }
}