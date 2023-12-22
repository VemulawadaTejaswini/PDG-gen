import java.util.*;

public class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
		 double a = sc.nextDouble();
		 double b = sc.nextDouble();
		 double d = 0;
		 double r = 0;
		 double f = 0;
		 d = a / b;
		 r = a % b;
		 f = a / b;
		 System.out.printf((int)d + " " + (int)r + " " + "%.8f",f);
        
    }
}
