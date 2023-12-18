import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String card = r + g + b;
        
        int num = Integer.parseInt(card);
        
        if(num % 4 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
