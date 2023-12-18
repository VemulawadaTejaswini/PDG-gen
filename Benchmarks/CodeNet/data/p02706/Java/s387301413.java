import java.util.*;
class  Main{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
           int N= scan.nextInt();
           int M = scan.nextInt();
           for(int i=0;i<M;i++){
               N-=scan.nextInt();
           }
           if(N<0){
               System.out.println(-1);
           }
           else{
               System.out.println(N);
           }
          }
   }
