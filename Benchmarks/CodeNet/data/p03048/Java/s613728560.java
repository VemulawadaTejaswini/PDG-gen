import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        
        int r = N / R;
        int g = N / G;
        int b = N / B;
        
        for(int i = 0; i <= r; i++){
            for(int j = 0; j <= g; j++){
                for(int k = 0; k <= b; k++){

                    int n = N;
                    n -= (R * i) + (G * j) + (B * k);

                    if(n == 0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}