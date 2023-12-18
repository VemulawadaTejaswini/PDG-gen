import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
      	int price1 = sc.nextInt();
      	int price2 = sc.nextInt();
      	price1 *= hour;
      	
      	if(price1 < price2) {
        	System.out.println(price1); 
        } else {
          	System.out.println(price2); 
        }
    }
}