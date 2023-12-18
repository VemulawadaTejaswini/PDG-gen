import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), blue = sc.nextInt(), red = sc.nextInt();
        
        int count = n / (blue + red);
        int rem = n % (blue + red);
        
        if(blue == 0){
            System.out.println(blue);
        } else if(n < (blue + red)) {
            if(n>blue){
                System.out.println(blue);
            } else {
                System.out.println(n);
            }
        } else {
            System.out.println((count * blue) + rem);    
        }
            
        
        
    }
}
