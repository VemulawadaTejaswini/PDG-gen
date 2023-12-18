
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
        }
        int count = 0;
        for(int i = 1; i + 1 < n; i++){
            if((p[i - 1] - p[i]) * (p[i + 1] - p[i]) < 0){
                count++;
            }
        }
        System.out.println(count);    
    }
}