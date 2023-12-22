import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
      
      	int red = scanner.nextInt();
      	int green = scanner.nextInt();
      	int blue = scanner.nextInt();
      	int count = scanner.nextInt();
            
        while(!((blue > green) && (green > red))) {
        	if(blue > green) {
              green *= 2;
            } else {
              blue *= 2;
            }
          
          	count -= 1;
        }
      
      	if(count >= 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");        
        }
    
    }
}


