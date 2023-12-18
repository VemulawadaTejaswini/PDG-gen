import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] d = new int[N];
        int middle;
        int count = 1;

        for(int i=0; i < N; i++){
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);

        middle = d[N/2];

        if(d[N/2] == d[N/2-1])

        for(int i=N/2; i>1; i--){
            count++;
            if(d[N/2] != d[i]){
                break;
            }
        }    
        System.out.println(count);    
    }
}