import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        int q = x % y;

        int max = 0;

        for(int i = 1; i < x; i++){
            if(y % i == 0 && q % i == 0){
                max = i;
            }
        }
        System.out.println(max);
    }
}