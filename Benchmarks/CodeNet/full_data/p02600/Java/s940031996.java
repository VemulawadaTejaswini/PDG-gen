import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
   
    if(X<=599){
    	System.out.println("8");
    }else if(X<=799) {	
       	System.out.println("7");   	
    }else if(X<=999) {	
       	System.out.println("6");     	
	}else if(X<=1199){	
		System.out.println("5");   	
	}else if(X<=1399) {	
		System.out.println("4");    	
	}else if(X<=1599) {	
		System.out.println("3");   	
	}else if(X<=1799) {	
		System.out.println("2");	
    }else{
    	System.out.println("1");
      }
}
}
