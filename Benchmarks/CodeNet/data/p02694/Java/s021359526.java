import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double m = 100;
        long count=0;
        
        for(int i=1;;i++){
            if(m>=X){
                break;
            }
            m = m + Math.floor(m * 0.01);
            count++;
        }
        System.out.println(count);
    }
}