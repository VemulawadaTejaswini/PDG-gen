import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double ret = Math.sqrt(a) + Math.sqrt(b);
        if(ret < Math.sqrt(c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }  
	}

}