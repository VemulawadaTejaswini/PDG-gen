import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new java.io.InputStreamReader(System.in));
        int a = Integer.parseInt(read.readLine());
        int b = Integer.parseInt(read.readLine());
        System.out.println(a*b+" "+(a+b)*2);
    }
}