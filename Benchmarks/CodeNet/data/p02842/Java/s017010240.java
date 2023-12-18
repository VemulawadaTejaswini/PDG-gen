import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        int ans = (int)Math.ceil(x/1.08);
        
        if(Math.floor(ans*1.08)==x){
            System.out.println(ans);
        }else{
            System.out.println(":(");
        }
   }
}
