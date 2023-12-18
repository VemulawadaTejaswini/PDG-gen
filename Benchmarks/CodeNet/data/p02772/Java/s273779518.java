import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[n];
        String ans = "APPROVED";
        
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(input[i]);
            if(numbers[i] % 2 == 0){
                if(numbers[i] % 3 != 0 && numbers[i] % 5 != 0){
                    ans = "DENIED";
                    break;
                }
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}