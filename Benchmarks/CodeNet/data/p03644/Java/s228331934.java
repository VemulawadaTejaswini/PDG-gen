import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        int input = Integer.parseInt(s);
        
        int count = 0;
        
        while(input % 2 == 0){
            input /= 2;
            count++;
        }
        System.out.print(count);
    }
}