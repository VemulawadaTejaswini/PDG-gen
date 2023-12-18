import java.util.Scanner;
 public class Main{
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     if(a<b){
     for(int i=0; i<b; i++){
       System.out.println(a);
     }
     }else if(a>b){
       for (int j=0; j<a; j++){
         System.out.println(b);
       }
       }
   }
 }