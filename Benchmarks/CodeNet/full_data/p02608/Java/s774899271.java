import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int[] count = new int[n+1];
        for(int x=1; x<Math.sqrt(n); x++) {
            if((x+2)*(x+2)-(2*x) > n) break;
            for(int y=1; y<Math.sqrt(n); y++) {
                if((x+y+1)*(x+y+1)-(x*y+y+x) > n) break;
                for(int z=1; z<Math.sqrt(n); z++) {
                    if((x+y+z)*(x+y+z)-(x*y+y*z+z*x) > n) break;
                    count[(x+y+z)*(x+y+z)-(x*y+y*z+z*x)]++;
                }
            }
        }
        
        for(int i=1; i<=n; i++) {
            System.out.println(count[i]);
        }
    
    }
}
