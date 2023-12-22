import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        double num1 = sc.nextDouble();
        
        System.out.printf("%.6f %.6f\n",num1 * num1 * Math.PI,2 * num1 * Math.PI);
    }
}
