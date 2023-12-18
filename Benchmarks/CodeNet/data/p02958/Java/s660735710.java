import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a;
    int count = 0;

    for(int i=0; i<n; i++){
      a = sc.nextInt();
      if(a==i+1){
        count += 1;
        }
      }
    if(n - count>=3){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}
