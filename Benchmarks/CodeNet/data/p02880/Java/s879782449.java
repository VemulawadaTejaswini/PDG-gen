import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextInt();
		
    		for(double i = 1; i < 10; i++){
    		    
    		    double b = a/i;
    		    
    		    if(a % i == 0.0 && b < 10.0) {
    		        System.out.println("Yes");
    		    } else if(i >= 9.0){
    		        System.out.println("No");
    		    } else {
    		        continue;
    		    }
    		}



	}
}