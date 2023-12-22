import java.io.*;
import java.util.*;
 
class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str=br.readLine();
            if(str.equals("0")) break;
            char[] c_array=str.toCharArray();
            int sum=0;
            for(char c:c_array) sum+=Integer.parseInt(String.valueOf(c));
            System.out.println(sum);
        }
    }
}
 