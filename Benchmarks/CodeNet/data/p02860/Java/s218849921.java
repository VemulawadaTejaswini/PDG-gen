import java.util.*;

public class Main {
    
    public static void main(String[] args) {
             
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        
        if (n % 2  == 1){
            System.out.println("No");
        }else{
            int mid = (int)n / 2;
            String s_1 = s.substring(0, mid);
            String s_2 = s.substring(mid);
            if (!s_1.equals(s_2))
                System.out.println("Yes");
            else
                System.out.println("No");
           
        }        
            
        }
    }