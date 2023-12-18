import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int i = n - 1; i > 0; i--){
            if(h[i - 1] >= h[i]){
                count++;
            } else {
                if(count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        if(count > max) {
            max = count;
        }

        System.out.println(max);
    }
}