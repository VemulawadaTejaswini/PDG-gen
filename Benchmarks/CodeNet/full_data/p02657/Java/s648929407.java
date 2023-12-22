import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String[] str_array = br.readLine().split(" ");

        int ans = Integer.parseInt(str_array[0]) * Integer.parseInt(str_array[1]);
        
        pw.println(ans);
        br.close();
        pw.close();
    }
}