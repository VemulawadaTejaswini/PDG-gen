import java.util.Scanner;

public class Main{
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     while(true){
        int H=sc.nextInt();
        int W=sc.nextInt();
        if(H  == 0 && W == 0){
           break;
         }
      for(int i = 1; 1 < i; i++){
         for(int j = 0; j < 300; j++){
        System.out.print("#");
   }
   System.out.println("");
   }
  }
 }
}