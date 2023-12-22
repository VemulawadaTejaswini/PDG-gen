import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	float length = sc.nextFloat();
      	int time = sc.nextInt();
      	float sokudo = sc.nextFloat();
      
      	if(length / sokudo <= time) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");        	
        }
    
    }
}