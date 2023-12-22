import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
      	long i; 
      	int c=0;
      	long X =sc.nextLong();  
      
      	for(i=100;i<=X;i=i*101/100){
        	c++;
        }
      	System.out.println(c);
    }
}