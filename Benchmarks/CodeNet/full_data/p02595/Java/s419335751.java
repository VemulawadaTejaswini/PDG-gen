import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
//        String T=br.readLine();
//        if(T!=null) t=Integer.parseInt(T);
        while(t-- > 0) {
            int n; long d;
            String[] input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            d = Long.parseLong(input[1]);
            d = d * d;
            int c = 0;
            for(int i = 0; i < n; i++) {
                String[] input1 = br.readLine().split(" ");
                int x = Integer.parseInt(input1[0]);
                int y = Integer.parseInt(input1[1]);
                long distance = (x * x) + (y * y);
                if(distance <= d) c++;
            }
            System.out.print(c + "\n");
        }
    }
}