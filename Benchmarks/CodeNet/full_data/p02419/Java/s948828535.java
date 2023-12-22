import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    	int count=0;
    	while(true) {
    	   Scanner sc = new Scanner(System.in);
    	   String str = sc.nextLine();
    	   if (str.equals("W") || str.equals("w")){
    		   count++;
    	   }
    	   System.out.println(count);
    	   sc.close();
    	}
    	     
    		   
    	   }
    }
