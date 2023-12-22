import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String ia[];
                while((is = in.readLine()) != null){
                        ia = is.split(" ");
                        System.out.println(ea(Integer.parseInt(ia[0]),Integer.parseInt(ia[1])));
                }   
        }   
            
        static int ea(int m, int n){ 
                if(n == 0){ 
                        return m;
                }   
                return ea(n, m%n);
        }   
}