import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int result = fact(a);

        System.out.println(result);
    }

    private static int fact(int x){
        if(x == 1) return 1;
        else return x * fact(x-1);
    }
}