import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a;
        int count = 0;
        for(int i = 0; i < n; i++){
            a = Integer.parseInt(br.readLine());
            if(a == 2) count++;
            if(a > 2){
                for(int j = 2; j < a; j++){
                    if(a % j == 0) count++;
                }
            }
        }
        System.out.println(count);
    }

}