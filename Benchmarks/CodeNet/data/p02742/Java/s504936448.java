import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        Long h = sc.nextLong();
        Long w = sc.nextLong();
        if(h == 1 || w == 1) {
            System.out.println(1); 
            return;
            
        }
        System.out.println((h * w + 1) / 2);
        
    }
}
