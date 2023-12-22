import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int n = 1;
int j = 1;
Scanner sc= new Scanner(System.in);

while(true) {
int H = sc.nextInt();
int W= sc.nextInt();
if (H == 0 && W == 0) {
break;
}
while(n<=H){
     if(n%2 == 1){
         while(j<=W){
              if(j%2 == 1){
                      System.out.printf("#");
              }
              if(j%2 == 0){
                      System.out.printf(".");
              }
              
              j++;
         }
       System.out.printf("\n");
       }
      else{
           while(j<=W){
              if(j%2 == 1){
                      System.out.printf(",");
              }
              else{
                      System.out.printf("#");
              }
              
              j++;
                     
        }   System.out.printf("\n");
}

        j =1;n++;
}
         }
}
 System.out.printf("\n");
}