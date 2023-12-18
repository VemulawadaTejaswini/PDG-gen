import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int count = stdIn.nextInt();
        
        for(int i = 0; i < count; i++){
            long syoko = stdIn.nextInt();
            long tousa = stdIn.nextInt();
            long kousu = stdIn.nextInt();
            long seki = 1;
            
            for(int j = 1; j <= kousu; j++){
                seki = seki * syoko;
                
                seki = seki % 1000003;
                
                syoko += tousa;
                
            }
            
            
            System.out.println(seki);
        }
    }
}
