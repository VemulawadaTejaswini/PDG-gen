  import java.util.Scanner;
 
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
　　int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
      
       int i = 0;
 
       if(a == b && b == c && a % 2 == 0 ) {
       i = -1;
       } else {
       while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
           int A = a;
           int B = b;
           int C = c;
          
           a = B/2 + C/2;
           b = C/2 + A/2;
           c = A/2 + B/2;
           i++;
       }
       }
      Sysytem.out.println(i);
  }
}