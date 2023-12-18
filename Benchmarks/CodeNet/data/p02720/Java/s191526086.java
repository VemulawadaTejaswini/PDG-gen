import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n =scn.nextLong();
		 PriorityQueue<Long> pq =new PriorityQueue<>();
		   long i=0;
		   for(i=0;i<9;i++){
			   pq.add(i+1);
		   }
		   i=0;
		   while(i<n-1 && pq.size()>0){
			   long val =pq.remove();
			         if(val%10!=0){
				   pq.add(val*10+(val%10-1));
			         }
			         if(val%10!=9){
			   long val1=val*10+(val%10+1);
			   pq.add(val1);
			   }
			         
			   long val2=val*10+(val%10);
			 
			   pq.add(val2);
			   i++;
			  
			   
		   }
//         while(pq.size()>1){
//        	 pq.remove();
//         }
         System.out.println(pq.remove());
	}

}