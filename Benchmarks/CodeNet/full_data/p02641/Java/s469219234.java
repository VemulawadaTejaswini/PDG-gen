import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        
        int minDiff = 10000;
        int closest = -2;
        boolean[] vals = new boolean[101];
        for(int i = 0 ; i < n ; i++) {
            vals[scan.nextInt()] = true;
            
        }

        
        for(int i = -1 ; i <= 101 ;i++) {
            if(i == -1 || i == 101 || !vals[i]) {
                if(minDiff > Math.abs(x-i)) {
                    minDiff = Math.abs(x-i);
                    closest = i;
                }    
            }
        }
        System.out.println(closest);
    }
}