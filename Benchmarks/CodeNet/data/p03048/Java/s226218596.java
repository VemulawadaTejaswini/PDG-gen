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
            if(N - R * i < 0) break;

            for(int j = 0; j <= g; j++){
                if(N - (R * i + G * j) < 0 )break;
                
                for(int k = 0; k <= b; k++){
                        if(N -(R * i + G * j + B * k) == 0){
                        count++;
                        break;
                    }else{
                        continue;
                    }
                }
            }
        }
        System.out.println(count);
    }
}