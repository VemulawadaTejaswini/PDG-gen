import java.util.Scanner;

public class Main{

 public static void main(String[] args){

  Scanner square = new Scanner(System.in);
  
  while(true){
   
   int restH=0;
   int restW=0;
   
   int H = square.nextInt();
   int W = square.nextInt();
   if(H==0 && W==0) break;
   restH = H%2;
   restW = W%2;

   for(int i=0;i<H;i++){
    for(int j=0;j<W;j++){
     
     restH = i%2;
     restW = j%2;     

     if(restH==0 && restW==0)
      System.out.print("#");
     if(restH==0 && restW==1)
      System.out.print(".");
     if(restH==1 && restW==0)
      System.out.print(".");
     if(restH==1 && restW==1)
      System.out.print("#");
    }
    System.out.println("");
   }
  }
 }
}