

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder print=new StringBuilder();
        int x=Integer.parseInt(br.readLine());
        x=1-x;
        System.out.println(x);
    }
}
