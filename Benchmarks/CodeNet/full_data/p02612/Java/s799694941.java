import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int a=n/1000;
   if(n%a*1000==0){
     System.out.println(0);
   }else{
   System.out.println(1000*(a+1)-n);
 }
}
}
