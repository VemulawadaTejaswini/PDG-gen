import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int Nint = Integer.parseInt(N);
        
        int[] ans = new int[100000];
        
        for (int x = 1; x <= 100; x++){
            for(int y = 1; y <= 100; y++){
                for(int z=1; z<=100; z++){
                    double i = Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+x*y+y*z+z*x;
                    int ii = (int)i;
                    ans[ii]++;
                }
            }
        }
        
        for(int i=1; i<Nint+1; i++){
            System.out.println(ans[i]);
        }
    }
}
