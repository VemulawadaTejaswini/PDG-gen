
import java.util.Hashtable;
import java.util.Scanner;


public class Main{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int total = 0, id =0, p=0, q = 0, i=1;
		double mul = 1;
		
		Scanner sc = new Scanner(System.in);
		 while(true) {
			 total = sc.nextInt();
			 
			 if(total<=0 ) {
				 return;
			 }
			 
			
			 Hashtable<Integer, Double> sales = new Hashtable<Integer, Double>();
			 for(i=1; i<=total; i++) {
				 id = sc.nextInt();
				 p = sc.nextInt();
				 q = sc.nextInt();
				 
				 mul = p*q;
				 if(sales.containsKey(id) ) {
					 if(sales.get(id).doubleValue() < 1000000) {
					  sales.put(id, mul + sales.get(id).doubleValue());
					 }
				 } else {
					 sales.put(id, mul );
				 }
				 
				
			 }
			 
			
			 boolean hasMax = false;
			 for (int key : sales.keySet()) {				
				 if(sales.get(key).doubleValue() >= 1000000 ) {	
					 hasMax = true;
					 System.out.println(key);
				 } 
				}
			  
		 
		     if(hasMax == false) {
				 System.out.println("NA");
			 }
			 
		 }

	}

}