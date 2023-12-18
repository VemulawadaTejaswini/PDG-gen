import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        long counter = 0;
        long[] dams = new long[N];
        for(int i = 0; i < N; i++){
            long temp = scanner.nextInt();
            if(i % 2 == 0){
                counter = counter + 2*temp;
            }
            else {
                counter = counter - 2*temp;
            }
            dams[i] = 2*temp;
        }
        long x = counter/2;
        for(int j = 0; j < N; j++){
            long temp = x;
            x = dams[j] - x;
            dams[j] = temp;
        }

        for(int k = 0; k < N; k++){
            System.out.print(dams[k] + " ");
        }


    }
}
