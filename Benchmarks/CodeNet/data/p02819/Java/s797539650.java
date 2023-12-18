import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter X value.");
    int X = myObj.nextInt();
    
    int i, m=0, flag=0, loop=0;     
         
    
    while (loop == 0) {
        m=X/2;      
        if(X==0|| X==1) {  
            flag = 1;
        }
        else {  
            for(i = 2; i <= m; i++) {      
                if(X%i == 0) {    
                    flag = 1; 
                    break;      
                } 
            } 
        }
        if(flag == 1) {
           X = X + 1;
           flag = 0;
        }
        else {
          loop = 1;
        }  
    }
    System.out.println(X);        
}
}
