import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        String r = scan.next();
        String g = scan.next();
        String b = scan.next();
        
        String card = r + g + b;
        
        int num = Integer.parseInt(card);
        
        if(num % 4 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
