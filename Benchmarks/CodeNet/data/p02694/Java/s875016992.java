import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        long X=0;
        int i=-1;
        int n = 100;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(r.readLine());
        while(n<=X){
            i++;
            n = n*101;
            n = n/100;
            continue;
        }
        System.out.println(i);
    }
}