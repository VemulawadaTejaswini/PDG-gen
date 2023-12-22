import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a;
        int c = 0;
        
        for(int i=0 ; i<N; i++){
            a = Integer.parseInt(br.readLine());
            
            if(a==2){
                c++;
            }else{
                for(int j = 2;j<=a-1;j+=2){
                if(a%j == 0) break; 
                if(j == a-1) c++;
                }
            }
            
        }
        System.out.println(c);
        
        
        
    }
}