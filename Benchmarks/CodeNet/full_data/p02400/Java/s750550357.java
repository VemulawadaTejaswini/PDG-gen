import java.math.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        String a = scan_.next();
        double a_ = Double.parseDouble(a);
        double menseki = a_ * a_ * 3.14159265358979323846;
        double enshuu = a_ * 2 * 3.14159265358979323846;
        System.out.println(
            String.format("%.8f" , menseki) + " " + String.format("%.8f" , enshuu)
        );
        
        
        
        
        }
      }


