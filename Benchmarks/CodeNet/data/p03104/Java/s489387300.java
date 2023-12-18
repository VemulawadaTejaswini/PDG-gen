import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        if(A % 2 == 0) {
            if(B % 2 == 0) {
                System.out.println(B ^ ((B - A) / 2 % 2));
            }else {
                System.out.println((B - A + 1) / 2 % 2);
            }
        }else {
            if(B % 2 == 0) {
                System.out.println(A ^ B ^ ((B - A - 1) / 2 % 2));
            }else {
                System.out.println(A ^ ((B - A) / 2 % 2));
            }
        }
    }
}