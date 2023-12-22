import java.util.Scanner;

public class Main{
    static int[] balls = new int[10];
    
    static boolean order(int i,int B,int C) {
        if(i<10) {
            if(balls[i]>B) {
                return order(i+1,balls[i],C);
            }
            if(balls[i]>C) {
                return order(i+1,B,balls[i]);
            }
            if(balls[i]<=B && balls[i]<=C){
               return false;
            }
        }
       return true;
    }
    
   public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
           int n = sc.nextInt();
           for(int i=0;i<n;i++) {
               for(int j=0;j<10;j++) {
                   balls[j] = sc.nextInt();
               }
               if(order(0,0,0)) {
                   System.out.println("YES");
               }else {
                   System.out.println("NO");
               }
           }
       }
   }
}
