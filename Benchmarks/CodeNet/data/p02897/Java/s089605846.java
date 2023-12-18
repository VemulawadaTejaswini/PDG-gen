import java.util.*;


public class Main{
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        if(n%2 == 0){
            System.out.print("0.50000");
        }else if(n == 1){
            System.out.print("1.0000000000");
        }else{
            double m = n-1;
            double s = 2*n;
            System.out.print(String.format("%.7f", m / s));
        }
        
    }
}