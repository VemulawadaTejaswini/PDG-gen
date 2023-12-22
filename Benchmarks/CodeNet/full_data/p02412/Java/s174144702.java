import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        int x = 0;

        while(true){
            String imput = br.readLine();
            String[] strArray = imput.split(" ");
            n = Integer.parseInt(strArray[0]);
            x = Integer.parseInt(strArray[1]);

            if(n == 0 && x == 0){
                break;
            }

            int count = 0;

            for(int i = 1; i <= n; i++){
                for(int j = 1; j < i; j++){
                    for(int k = 1; k < j; k++){

                        if(i + j + k == x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}