import java.util.Scanner;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
        int W = as.nextInt();
        int H = as.nextInt();
        int x = as.nextInt();
        int y = as.nextInt();
        int r = as.nextInt();
        int tr;

        if(x>=W || y>=H){
          System.out.println("No");
 
        
         }
        else if(r>x || r>y){
        
          System.out.println("No");
             
               }
              else{

                 System.out.println("Yes");
               
        }  
              
 
 
   }
 
 
}