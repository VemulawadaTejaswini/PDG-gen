import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = n;
        int soinshi = 2;

        if(n % soinshi == 0){
            result /= soinshi;
            do{
                n /= soinshi;
            }while(n % soinshi == 0);
        }

        for(soinshi = 3; soinshi*soinshi <= n; soinshi += 2){
            if(n % soinshi == 0){
                result = result * (soinshi - 1) / soinshi;
                do{
                    n /= soinshi;
                }while(n % soinshi == 0);
            }
        }

        // n = 6などのforループを一度も通らないnの時に必要
        if(n > 1){
            result = result * (soinshi - 1) / soinshi;
        }

        System.out.println(result);
    }
}
