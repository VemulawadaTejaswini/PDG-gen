import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
     long ans=1;
     int p;
     int s,u,v;
    if((x+y)%3==0){
      u = (x+y)/3;//goukeikaisuu
      v = Math.abs(x-y);//sanokaisuu
      if(u%2 == v%2){
        s = (u+v)/2;
        for( int ns = u , ms = 1; ms <= s; ns ++, ms ++ ) {
          ans *= ns;
          ans %= p;
          ans /= ms;
        }
      }else{
        ans = 0;
      }
    }else{
      ans = 0;
    }
    p = (int)Math.pow(10,9)+7;
     System.out.println(ans%p);
   }

   
}
