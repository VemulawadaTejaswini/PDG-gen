
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n + 1];
        int answer = 0;
        int[] b = new int[n];
        for(int i  = 0; i < n + 1; i++){
            a[i] = stdIn.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = stdIn.nextInt();
        }

        
        for(int i = 0; i < n; i++){
            if(a[i + 1] + a[i] <= b[i]){
                answer += a[i] + a[i + 1];
                a[i] = 0;
            }else{
                answer += b[i];
                if(a[i + 1] < b[i]) a[i] += a[i + 1] - b[i];
            }
        }
        System.out.println(answer);
    }
}