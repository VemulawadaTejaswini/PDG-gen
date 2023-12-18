import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int pos[] = new int[n + 1];
        int posDiff[] = new int[n];
        
        for(int i = 0; i < n; i++){
            pos[i] = sc.nextInt();
        }
        pos[n] = x;
        Arrays.sort(pos);
        for(int i = 1; i < n + 1; i++){
            posDiff[i - 1] = pos[i] - pos[i - 1];
        }
        
        int r = posDiff[0];
        for(int i = 1; i < n; i++){
            int mod = 1;
            int x1 = r;
            int x2 = posDiff[i];
            while(mod != 0){
                int tmp = x1;
                if(x1 < x2){
                    x1 = x2;
                    x2 = tmp;
                }
                r = x1 / x2;
                mod = x1 % x2;
            }
        }

        System.out.println(r);
    }
}
