import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();

      int ans=0;

      for(int i=1;i<=n;i++){
        if(i<=9){
          ans++;
        }
        else if(100<=i && i<=999){
          ans++;
        }
        else if(10000<=i && i<=99999){
          ans++;
        }
      }

      System.out.println(ans);

    }
}
