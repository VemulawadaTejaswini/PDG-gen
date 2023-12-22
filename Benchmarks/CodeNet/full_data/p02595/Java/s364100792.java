import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int d = Integer.parseInt(input1[1]);
        
        Integer[][] numbers = new Integer[n][2];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            String[] input2 = br.readLine().split(" ");
            numbers[i][0] = Integer.parseInt(input2[0]);
            numbers[i][1] = Integer.parseInt(input2[1]);
            if(Math.sqrt(Math.pow(numbers[i][0], 2) + Math.pow(numbers[i][1], 2)) <= d){
                ans++;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}