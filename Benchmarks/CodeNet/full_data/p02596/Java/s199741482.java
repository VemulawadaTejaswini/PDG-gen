import java.util.Scanner;

public class Main {


      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = 1;
            int modulo = 7;
            while(modulo%n != 0){
                  modulo = (modulo *10 + 7)%n;
                  ans++;
                  if(ans >=n+2){
                        ans  = -1;
                        break;

                  }            }
            System.out.println(ans);

      }


}
