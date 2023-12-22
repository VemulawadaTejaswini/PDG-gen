//4-D
import java.util.Random;
import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      Random ran = new Random();
      
      int n = sc.nextInt();
      
      long sum = 0;
      
      int num [] = new int [n];
      
      	/*for(int i = 0 ; i < num.length ; i++ ){
	   	 num [i] = ran.nextInt(1000000);
	   	 //System.out.println(num[i]);
	   	 
	   	 sum = sum + num[i];
	   	 
	   }*/
      
	   for(int i = 0 ; i < num.length ; i++ ){
      		num[i] = sc.nextInt();
      		
      		sum = sum + num[i];

      	}
	   
  		int max = num[0];
  		int min = num[0];
	
		for(int i=0; i < num.length; i++ ){
			
			if (max < num[i]){	
				
				max = num[i];
				
				}
			
			if (min > num[i]){	
				
				min = num[i];
				
				}
		}
	
      System.out.println(min + " " + max + " " + sum);
	
  }
}