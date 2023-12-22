import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] a) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            String[] check = line.split(" ");
            int val1 = Integer.parseInt(check[0]);
            int val2 = Integer.parseInt(check[1]);
            int sum = val1 + val2;
            String str = String.valueOf(sum);
            System.out.println(str.length());
        }
    }
}