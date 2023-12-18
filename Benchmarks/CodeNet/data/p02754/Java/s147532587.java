import java.util.*;

public class Main {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), blue = sc.nextInt(), red = sc.nextInt();
        
        int count = 0;
        int rem = 0;
        if(blue != 0 && red != 0){
        count = n / (blue + red);
        rem = n % (blue + red);
        }
        
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
