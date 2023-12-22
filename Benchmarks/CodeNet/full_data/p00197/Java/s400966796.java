import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            while(true){
            	int a =scan.nextInt();
            	int b = scan.nextInt();
            	if((a|b)==0)break;
            	a = Math.max(a,b);
            	b = Math.min(a,b);
            	int c=0;
            	while(b!=0){
            		a%=b;
            		a=a^b;
            		b=a^b;
            		a=a^b;
            		c++;
            	}
            	System.out.println(a+" "+c);
            }
  
        }
   
}