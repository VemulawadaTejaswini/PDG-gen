import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        System.out.println(sb.reverse().toString());
    }
}