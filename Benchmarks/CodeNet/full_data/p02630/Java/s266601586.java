
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       HashMap<Integer,Integer> map = new HashMap<>();
       int temp;
       long sum=0;
       for(int i =0; i < n; i++) {
           temp = s.nextInt();
           sum+=temp;
           map.put(temp,map.getOrDefault(temp,0));
           }
       }
//       System.out.println(map);
       int q = s.nextInt();
       int b,c=0,count=0;
       while(q-->0) {
           b = s.nextInt();
           c = s.nextInt();
           count=0;
           if(map.containsKey(b)) {
               temp = map.get(b);
               map.remove(b);
               int x=temp*b;
             int y=temp*c;
               sum = sum -x+y;
              map.put(c,map.getOrDefault(c,0)+temp);
           }
//           System.out.println(map);
           System.out.println(sum);
       }
   }
}
