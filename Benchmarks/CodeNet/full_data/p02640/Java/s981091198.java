import java.util.*;

public class Mail{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
      	int x = sc.nextInt();
      	int y = sc.nextInt();
      
        for(int i = 0; i < x; i++){
        	int a = 2 * i;
          	int b = 4 * (x - i);
          	
          	if(a + b == y)
              System.out.print("Yes");
          	  return;
        }
      	
        System.out.print("No");
    }
}
