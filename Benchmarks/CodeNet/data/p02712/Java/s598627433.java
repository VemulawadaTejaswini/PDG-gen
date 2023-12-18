import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        long sum = 0;
        int n = Integer.parseInt(f.readLine());
        int i = 0;
        while(n > 0){
            if(i % 3 != 0 && i % 5 != 0){
                sum+=i;

            }
            n--;
            i++;
        }
        out.println(sum);
        out.close();
    }
}
