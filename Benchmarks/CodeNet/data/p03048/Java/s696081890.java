import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.In);
    int r=sc.nextInt();
    int g=sc.nextInt();
    int b=sc.nextInt();
    int n=sc.nextInt();
    int count=0;
    
    for(int i=0;i<=n/r;i++){
      for(int j=0;j<=n/g;++j){
        for(int k=0;k<=n/b;++k){
          if(r*i+g*j+b*k==n){
            count++;
          }
        }
      }
    }
    System.out.print(count);
  }
}
