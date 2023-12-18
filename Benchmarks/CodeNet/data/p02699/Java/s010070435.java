import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s = scan.nextDouble();
    	double w = scan.nextDouble();
 
    	if(s/2 <= w){
    		System.out.println("unsafe");
    	} else {
    		System.out.println("safe");
    	}
    	
        scan.close();
    }
}