import java.util.Scanner;
import java.util.Arrays;
 
class Fruits{
 
public static void main(String...as){
Scanner sc=new Scanner(System.in);
  
  int totalFruits=sc.nextInt();
  int minimum=sc.nextInt();
  int prices[]=new int [totalFruits];
  for(int i=0;i<totalFruits;i++){
   prices[i]=sc.nextInt();
  }
	Arrays.sort(prices);
	int count=0;
  for(int i=0;i<minimum;i++){
  	count=count+prices[i];
  }
  
  System.out.println(count);
 
}
}