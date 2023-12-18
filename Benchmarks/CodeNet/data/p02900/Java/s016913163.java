import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();

      long ans = 1;

      long tmp;
      if(a>=b){
        tmp = b;
        b = a;
        a = tmp;
      }

      long ccc = 0;

      //for(long i=2;i<=a;i++){
      for(long i=2;i<=Math.sqrt(a);i++){
        if(a%i==0 && b%i==0){
          if(ccc!=i){
            ans++;
          }
          ccc = i;
          a /=i;
          b /=i;
          i--;
        }
        ///////////////////////
        /*if(i>=3){
          i++;
        }
        */
        ///////////////////////
      }

      if(ccc!=0){
        ans++;
      }

      System.out.println(ans);

    }
}
