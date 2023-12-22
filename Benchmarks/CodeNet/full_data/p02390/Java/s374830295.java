import java.util.Scanner;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
        int S = as.nextInt();

        int m=S/60;
        int h=m/60;
        int s=S%60;
        int m=m%60;
        
 
        System.out.println(h+":"+m+":"+s);
 
 
   }
 
 
}