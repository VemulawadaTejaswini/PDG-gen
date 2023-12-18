import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] numbers = new long[n];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            numbers[i] = Long.parseLong(input[i]);
        }
        
        label:
        while(true){
            for(int i = 0; i < n; i++){
                if(numbers[i] % 2 == 0){
                    numbers[i] /= 2;
                }else{
                    break label;
                }
            }
            ans++;
        }
        
        out.println(ans);
        out.close();
        
    }
}