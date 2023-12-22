import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.next());
        
        double area = r * r * Math.PI;
        double circle = 2 * r * Math.PI;
        
        System.out.println(String.format("%.8f",area) + " " + String.format("%.8f",circle));

    }

}

