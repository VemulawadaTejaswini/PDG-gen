import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int a=n%10;
   if(a==2||a==4||a==5||a==7||a==9){
     System.out.println("hon");
   }else if(a==3){
     System.out.println("bon");
   }else{
   System.out.println("pon");
   }
 }
}

