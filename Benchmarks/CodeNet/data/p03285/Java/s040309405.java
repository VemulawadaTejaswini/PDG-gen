import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<=25;i++){
      for(int j=0;j<=25;j++){
        if(n==4*i+7*j){
          System.out.println("Yes");
          return ;
        }
      }
    }
    System.out.println("No");
  }
}