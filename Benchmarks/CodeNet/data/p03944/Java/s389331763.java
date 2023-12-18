import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int w = Integer.parseInt(sc.next());
            int h = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());

            int smallXMax = 0;
            int largeXMin = w;
            int smallYMax = 0;
            int largeYMin = h;

            for(int i = 0; i < n; i++){
                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                int a = Integer.parseInt(sc.next());

                if(a == 1 && smallXMax < x) smallXMax = x;
                if(a == 2 && largeXMin > x) largeXMin = x;
                if(a == 3 && smallYMax < y) smallYMax = y;
                if(a == 4 && largeYMin > y) largeYMin = y;

            }

            int ans = (largeXMin - smallXMax)*(largeYMin - smallYMax);
            if(ans < 0) System.out.println(0);
            else System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
