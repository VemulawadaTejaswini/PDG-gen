import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int number = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(checkPrimeNumber(Integer.parseInt(br.readLine()))){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean checkPrimeNumber(int number) {
        if(number < 2){
            return false;
        }
        if(number == 2){
            return true;
        }
        if(number % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(number); i += 2){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}