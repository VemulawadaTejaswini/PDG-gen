import java.util.Scanner;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
       
        int x;
        int y;
        int tr;

        do{
           
           x = as.nextInt();
           y = as.nextInt();
           
           if(x>y){
              tr=x;
               x=y;
              y=tr;
             }
            
           System.out.println(x+" "+y);

        }while(x!=0 && y!=0);
 
 
   
 }
 
}