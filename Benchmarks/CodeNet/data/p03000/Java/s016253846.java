import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int currentPlace = 0;
        int c = 0;
        for(int k = 0; k < n; k++) {
        	if(currentPlace <= x) {
        		c ++;
        	} 
        	currentPlace = currentPlace + scanner.nextInt();
        }
        
        if(currentPlace <= x) {
        	c++;        }
        System.out.println(c);
    }
 
}