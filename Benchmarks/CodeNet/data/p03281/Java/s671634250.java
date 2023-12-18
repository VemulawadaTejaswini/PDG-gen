import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 0;

    for(int i=3; i<=n; i+=2){
      int count =0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count += 1;
        }
      }
      if(count==8){
        ans +=1;
      }
    }

    System.out.println(ans);

  }

}