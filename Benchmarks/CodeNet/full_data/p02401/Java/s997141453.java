import java.util.Scanner; 
 public class Main {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
       
            int a ;
            String op ;
            int b ;
       
            int sum=0;
       
            String tasu = "+" ;
            String hiku = "-" ;
            String kake = "*" ;
            String waru = "/" ;
            String end = "?" ;
       
       While(true){
           a = sc.nextInt();
           op = sc.next();
           b = sc.nextInt();
           if(op==tasu){
               sum=a+b;
           }
           if(op==hiku){
               sum=a-b;
           }
           if(op==kake){
               sum=a*b;
           }
           if(op==waru){
               sum=a/b;
           }
           if(op==end){
               break;
           }
       }
   }
 }
