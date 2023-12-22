import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int n=Integer.parseInt(reader.readLine())-1;n>=0;n--){
            if(n!=0) System.out.println(i[n]+" ");
            else System.out.println(i[n]);
        }
        
        
    }
}