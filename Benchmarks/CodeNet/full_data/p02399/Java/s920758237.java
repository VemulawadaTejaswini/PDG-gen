import java.util.Scanner;
class Main{   
 public void yatary() {  
      Scanner sc = new Scanner(System.in); 
     int a;
     int b;
     int d;
     int r;
     double f;
     a = sc.nextInt();
     b = sc.nextInt();
     d = a/b;
     r = a%b;
     f = a*1.0/b;
     System.out.printf("%d %d %7f",d,r,f);
     }
public static void main(String[] args){ 
    new Main().yatary();    
}
} 