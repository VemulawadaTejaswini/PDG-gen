import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	int d = scan.nextInt();

    	
    	while(a>=0){
    		if(c<=0){
    			break;
    		}
    		while(c>=0){
    			if(a<=0){
    				break;
    			}
    		c=c-b;
    		}
    	a=a-d;
    	}
    	
    	if(a<=0){
    		System.out.println("No");
    	} else if(c<=0) {
    		System.out.println("Yes");
    	}    	
    	
        scan.close();
    }
}