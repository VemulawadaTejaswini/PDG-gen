import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] A = new int[n];
        int chageBox = 0;
        int count = 0;

//      n????????´??°?????????A???????´?
        for (int i = 0; i < n; i++){
            A[i] = Integer.parseInt(input[i]);
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j > i; j--){
                if(A[j] < A[j-1]){
                    chageBox = A[j-1];
                    A[j-1] = A[j];
                    A[j] = chageBox;
                    count++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                System.out.print(A[i]);
            }else{
                System.out.print(" " + A[i]);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}