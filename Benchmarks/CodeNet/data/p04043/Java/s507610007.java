import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int in = 0;
        int x5 = 0;
        int x7 = 0;
        
        for(int i = 0 ; i < 3 ; i++){
            in = scan.nextInt();
            if(in == 5){
                x5 = x5 + 1;
            }
            if(in == 7){
                x7 = x7 + 1;
            }
        }
        
        String ans = "NO";
        
        if(x5 == 2){
            if(x7 == 1){
                ans = "YES";
            }
        }

        System.out.println(ans);
        
    }
}