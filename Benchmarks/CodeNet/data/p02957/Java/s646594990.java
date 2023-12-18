import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner in= new Scanner(System.in);

       int a =in.nextInt(),b=in.nextInt(),j=1;
       if(a==0||b==0){
           System.out.println("IMPOSSIBLE");
       }else{
           while(true){
               if(Math.abs(a-j)==Math.abs(b-j)){
                   System.out.println(j);
                   System.exit(0);
               }
               j++;
           }
       }
   }


}
