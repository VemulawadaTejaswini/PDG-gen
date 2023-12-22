import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(std.readLine());
        String st[] = std.readLine().split(" ");
        
        long sum = 0;
        
        int tmp = 0;
        int max = -1000000;
        int min = 1000000;
        
        for (int i = 0; i < n; i++){
            if(tmp>max) max = tmp;
            if(tmp<max) min = tmp;
            sum += tmp;
        }
        
        System.out.println(min + " " + max + " " + sum);
        
    }
}