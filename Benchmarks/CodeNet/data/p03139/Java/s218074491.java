import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int A = Integer.parseInt(str[1]);
        int B = Integer.parseInt(str[2]);
        System.out.println(Math.min(A, B) + " " +(A + B - N));
    }
}