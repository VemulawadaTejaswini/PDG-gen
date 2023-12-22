import java.io.*;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int    a = in.nextInt();
       int    b = in.nextInt();
       int    c = in.nextInt();
       int    i;
       int    x=0;
      
       for(i=a;i<=b;i++){
       if((c%i)==0){
       x = x++;
       }
       }

        System.out.println(x);

      

}
}