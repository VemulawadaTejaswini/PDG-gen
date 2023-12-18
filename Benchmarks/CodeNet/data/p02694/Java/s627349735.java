import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            long x = sc.nextLong();
            double yokin = 100;

            int ans = 0;
            while((double)x > yokin){
                yokin *= 1.01;
                yokin = Math.floor(yokin);
                ans++;
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}