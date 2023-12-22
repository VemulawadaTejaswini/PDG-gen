 import java.util.Scanner;
 
 public class PTC {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int i=1;
         int a;
         while(true){
             a=sc.nextInt();
             if(a!=0){
                 System.out.printf("Case %d: %d",i,a);
                 i++;
             }
             else break;
         }
     }
 }