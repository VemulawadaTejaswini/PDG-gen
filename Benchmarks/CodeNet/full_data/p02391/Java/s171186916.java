import java.util.Scanner;
public class Main {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int a;
	        int b;
	        a=scan.nextInt();
	        b=scan.nextInt();
	        if(a<b){
	        	System.out.println("a < b");
	        }
	       
	        else if(a>b){
	        	System.out.println("a > b");	
	        }
	        else{
	        	System.out.println("a == b");
	        }
	    }
	}

