import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
	   int a,b,c,d;
	   a=1;b=1;
       Scanner sc = new Scanner(System.in);
       while (a!=0 || b!=0){
       a = sc.nextInt();
       b = sc.nextInt();
       c = 1;
       d = 1;
       while(c<=a){
    	   while(d<=b){
    		   if(d!=b){
    			   System.out.print("#");
    		   }else{
    			   System.out.println("#");
    		   }
    		   d = d+1;
    	   }
    	   c = c+1;
    	   d = 1;
       }
       }
	}

}