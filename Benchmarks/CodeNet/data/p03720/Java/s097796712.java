import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(), m= sc.nextInt();
    int[] map = new int[n];
    for(int i=0; i<m; i++){
      int a =sc.nextInt(), b=sc.nextInt();
      for(int j=0; j<n; j++){
        if(j==(a-1) || j==(b-1)){
          map[j]+=1;
        }
      }
    }
    for(int num : map){
      System.out.println(num);
    }
  }
}