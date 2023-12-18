import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int r = sc.nextInt();
     int D = sc.nextInt();
     int x = sc.nextInt();
     int ans;
     for(int i = 1;i<=10;i++){
       ans = x*r - D;
       System.out.println(ans);
       x = ans;
     }


   }
}
