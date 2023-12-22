import java.util.Scanner;

     class Main{
        public static void main(String args[]){
           Scanner scan = new Scanner(System.in);

            int n =scan.nextInt();

            int i =1;

              for(;i<=n;i++){
              
                 if(i%3==0){
                 System.out.print(" "+i);
                 } else {
                   
                   int j=i;

                      while(j>0){

                          if(j%10==3){
                          System.out.print(" "+i);
                          break;
                          }

                      j/=10;

                      }
                   }
                 }                   
                          System.out.println();
        }
     }

