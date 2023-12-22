import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        int x = 0;

        while(n == 0 && x == 0){
            String imput = br.readLine();
            String[] strArray = imput.split(" ");
            n = Integer.parseInt(strArray[0]);
            x = Integer.parseInt(strArray[1]);

            int[] number = new int[n];
            int sum = 0;
            int count = 0;

            for(int i = 0; i < n-2; i++){
                for(int j = i + 1; j < n-1; j++){
                    for(int k = j + 1; k < n; k++){
                        sum = number[i] + number[j] + number[k];

                        if(sum == n){
                            count++;
                        }

                    }
                }
            }
            System.out.println(count);
        }



    }

}