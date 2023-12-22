
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a=0;

             int H = sc.nextInt();
             for(int i=1;i<=H;i++){
                 if (i%3==0) {
                     System.out.print(" "+i);
                 }else if(i%10==3){
                     System.out.print(" "+i);
                 }else{
                     a=i;
                     while(a>10){
                         a-=a%10;
                         a/=10;
                         if (a%3==0){
                             System.out.print(" "+i);
                             break;
                         }
                     }
                 }
             }

System.out.println();
    }
}
