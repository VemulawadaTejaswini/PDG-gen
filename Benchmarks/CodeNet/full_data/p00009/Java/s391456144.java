import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] data = new int[1000000];
        boolean[] isPrime = new boolean[1000000];
        //default??§false. ?´???°????????°false,?´???°??§??????????????°true??¨??????.
        isPrime[0] = true;
        isPrime[1] = true;
        int count = 0;
        
        for(int i = 2; i < 1000000; i++){

            if(!isPrime[i]){
                count++;
                for(int j = i*i; j < 1000000 && j > 0; j+=i){
                    isPrime[j] = true;
                }
            }

            data[i] = count;
        }

        String line;

        while( (line = br.readLine()) != null){
            System.out.println(data[Integer.parseInt(line)]);
        }

    }
}