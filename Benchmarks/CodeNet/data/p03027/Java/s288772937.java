import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int count = stdIn.nextInt();
        
        for(int i = 0; i < count; i++){
            int syoko = stdIn.nextInt();
            int tousa = stdIn.nextInt();
            int kousu = stdIn.nextInt();
            int seki = 1;
            
            for(int j = 1; j <= kousu; j++){
                seki *= syoko;
                
                seki %= 1000003;
                
                syoko += tousa;
                
            }
            System.out.println(seki);
        }
    }
}
