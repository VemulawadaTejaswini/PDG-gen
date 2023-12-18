import java.util.*;

public class Main{

  static int gcd(int a, int b) {return b>0?gcd(b,a%b):a;}


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        for(int k=1; k<=n; k++){
          sum += gcd(i,gcd(j,k));
        }
      }
    }


    System.out.println(sum);


  }
}