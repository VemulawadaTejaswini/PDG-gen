import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        long X=0;
        int i=0;
        double n = 100;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        X = Long.parseLong(r.readLine());
        while((long)n<=X){
            i++;
            n = Math.ceil(n*1.01);
        }
        System.out.println(i);
    }
}