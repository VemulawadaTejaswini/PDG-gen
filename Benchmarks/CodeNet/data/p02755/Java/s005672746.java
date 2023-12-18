import java.util.*;
import java.lang.*;
 
public class Main {
  
 public static void main(String[] args){
    
 	Scanner s=new Scanner(System.in);
    
  	int a=s.nextInt();
	int b=s.nextInt();
   
	int x=25*a/2;
    int y=(int)Math.floor(x*0.1);
   
    if(y==b)System.out.println(x);
   	else System.out.println(-1);
    
  }
}
