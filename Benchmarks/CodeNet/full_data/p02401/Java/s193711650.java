import java.util.Scanner;
class Main{   
 public void yatary() {  
      Scanner sc = new Scanner(System.in); 
     int x;
     int a = sc.nextInt();
     String op = sc.next();
     int b = sc.nextInt();
     while(op != "?"){
         x = 0;
        if ( op == " + " ){
           x = a + b;
            System.out.println(x);
        }else if( op == " - " ){
            x = a - b;
            System.out.println(x);
        }else if( op == " * " ){
            x = a * b;
            System.out.println(x);
        }else if( op == " / " ){
            x = a / b;    
            System.out.println(x);
        }
     a = sc.nextInt();
     op = sc.next();
     b = sc.nextInt();  
     }
  }
public static void main(String[] args){ 
    new Main().yatary();   
    }
} 