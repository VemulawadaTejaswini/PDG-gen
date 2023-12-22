import java.util.*;
class Main {
 public static void main(String[] args) {
   int x, y;
   Scanner scan=new Scanner(System.in);
   while(true){
    x = scan.nextInt();
    y = scan.nextInt();
    if ( x == 0 && y == 0 ) break; 
    if ( x < y ){
        System.out.printf("%d %d\n",x,y);
    } 
    else {
        System.out.printf("%d %d\n",y,x);
    }
   }
 }
 }
