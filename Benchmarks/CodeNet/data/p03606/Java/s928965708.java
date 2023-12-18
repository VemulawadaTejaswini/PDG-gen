import java.util.*;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();  
    
    int sum = 0;
    while (scan.hasNextInt()) {
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	sum += b - a + 1;
    }
	System.out.println(String.valueOf(sum));
	return;
  }  
}
