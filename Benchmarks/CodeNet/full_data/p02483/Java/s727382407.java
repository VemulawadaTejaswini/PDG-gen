import java.util.Scanner;

public class Main {

public static void main(String[] args) {

// ?¨??????\???????????????????????????????????????

Scanner sc = new Scanner(System.in);

// 3?????????????????????????????????????????´??°?????¨????????????????????????

int a = sc.nextInt();

int b = sc.nextInt();

int c = sc.nextInt();

if (a < b) {

      if (b < c) {

                System.out.printf("%d %d %d\n", a, b, c);

      } else if (a < c) {   

                System.out.printf("%d %d %d\n", a, c, b);

      } else if (a > c) {
                System.out.printf("%d %d %d\n", c, a, b);
             }
} else if (b < a) { 
      if (a < c){

                System.out.printf("%d %d %d\n", b, a, c);  

      } else if (b < c) { 

                System.out.printf("%d %d %d\n", b, c, a);

      } else if (b > c){ 

                System.out.printf("%d %d %d\n", c, b, a);
             }

       } 

if (a == b){
    if(c > a){
         System.out.printf("%d %d %d\n", a, b, c);
    }
    if(c < a){
         System.out.printf("%d %d %d\n", c, b, a);
    }
    if(c == b){
         System.out.printf("%d %d %d\n", a, b, c);
    }
}
if (b == c){
   if(a > b){
         System.out.printf("%d %d %d\n", c, b, a);
   }
   if(a < b){
         System.out.printf("%d %d %d\n", a, b, c);
   }
}
if (a == c){
   if(b > a){
         System.out.printf("%d %d %d\n", a, c, b);
   }
   if(b < a){
         System.out.printf("%d %d %d\n", b, c, a);
   }
}
}
}