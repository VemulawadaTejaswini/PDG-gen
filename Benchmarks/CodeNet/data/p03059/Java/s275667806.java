import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int bis = scanner.nextInt();
        int T = scanner.nextInt();
        double second = (double)T + 0.5;
        
        double ago = 0;
        int makedBiscket = 0;
        if (second >= (double)a){
            for (double i = 1; ago < second; i++){
        	makedBiscket += bis;
        	ago +=  (double)a * i;
    		}	
        }
        System.out.println(makedBiscket);
	}
}