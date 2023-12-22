import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
    	int w = scan.nextInt();
 
    	if(s/2 <= w){
    		System.out.println("unsafe");
    	} else {
    		System.out.println("safe");
    	}
    	
        scan.close();
    }
}