import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String imput = br.readLine();
            String[] strArray = imput.split(" ");
            int n = Integer.parseInt(strArray[0]);
            int x = Integer.parseInt(strArray[1]);

            if(n == 0 && x == 0){
                break;
            }

            int[] number = new int[n];
            int sum = 0;
            int count = 0;

            for(int i = 0; i < 3; i++){
                for(int j = i + 1; j < 4; j++){
                    for(int k = j + 1; k < 5; k++){
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