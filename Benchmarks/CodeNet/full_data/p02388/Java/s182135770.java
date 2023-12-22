import java.io.*;

public class Main {
    public static void main (String[] args) {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    int x = input.readLine();
    x = x^3;
    System.out.println(x);
    }
}
