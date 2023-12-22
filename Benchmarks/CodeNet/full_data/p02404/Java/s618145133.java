import java.util.Scanner;

class Main{
  private static int H,W;

  public static void main(String[] args){
    
    Scanner s= new Scanner(System.in);
   
   while(true){
   H=4;
   W=6;
   
   if(H==0&&W==0){
       break;
   }
   for(int i = 0;i<H;i++){
       
       for(int x=0;x<W;x++){
           
          if(i==0||i==H-1){
               System.out.println("#");
           }else
           
           {if(x==0||x<W-1){
               System.out.println("#");
               
       }else{
            System.out.println(".");
       }
           
       }
       System.out.println(" ");
       
   }System.out.println(" ");
   
  }
  }   
  }  
  
