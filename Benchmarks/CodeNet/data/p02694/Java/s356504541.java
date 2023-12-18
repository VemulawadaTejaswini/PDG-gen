import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
      	long i=100; 
      	int c=0;
      	long X =sc.nextLong();    	
      	while(true){
          	c++;
        	i=i*101/100;
          	if(i>=X){
              System.out.println(c);
              break;
            }
        }     	
    }
}