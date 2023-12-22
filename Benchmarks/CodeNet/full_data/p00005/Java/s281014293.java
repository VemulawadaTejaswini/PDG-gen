import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st;
            while((st= br.readLine())!=null){
                String[] s = st.split(" ",0);
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = a;
                int d = b;
                while(b!=0){
                    int k = b;
                    b = a%b;
                    a = k;
                }
                System.out.println(a+" "+(c/a)*d);
                
            }
        }catch(Exception ex){
            System.exit(0);
        }
    }
}