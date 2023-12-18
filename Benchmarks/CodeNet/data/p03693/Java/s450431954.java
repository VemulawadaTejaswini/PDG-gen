import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       
        Scanner scan = new Scanner(System.in);
        
        int r = scan.nextint();
        int g = scan.nextint();
        int b = scan.nextint();
        
        int rgb = r * 100 + g *10 + b;
        
        if((rgb % 4) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}