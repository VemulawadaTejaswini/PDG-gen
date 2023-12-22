import java.util.Scanner;                      
                                               
 class Main {                                  
    public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);      
     int a=0;
     int b=0;
    		 
     while(true){
    	    a = scanner.nextInt();
    	    b = scanner.nextInt();
    	    if ( a == 0 && b == 0 ) break;
            if(a<b)
    	    System.out.println(a+" "+b);
            else
            System.out.println(b+" "+a);
    	}

     scanner.close();
    }                                          
 }             
