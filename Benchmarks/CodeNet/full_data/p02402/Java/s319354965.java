import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       long a,b,c,d,e;
       a=2;
       b = sc.nextLong();
       c = b;
       d = b;
       e = b;
       while(a<=n){
    	   b = sc.nextLong();
    	   c = c + b;
    	   if (b > d){
    		   d = b;
    	   }else if (b < e){e = b;}
    	   a = a+1;
       }
       System.out.println(e + " " + d + " " + c);
	}

}