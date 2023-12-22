import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  while(true){
   int H = sc.nextInt();
   int W = sc.nextInt();
   if(H==0 && W==0){
    break;
   }
   else{
    for(int h=0;h<H;h++){
     System.out.printf("#");
     for(int w=1;w<W;w++){
      System.out.printf("#");
     }
     System.out.printf("\n");
    }
    break;
   }
  }
 }
}