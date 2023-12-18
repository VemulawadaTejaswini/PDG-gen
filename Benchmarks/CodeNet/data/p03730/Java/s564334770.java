   import java.util.Scanner;
 
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      for(int i = 1; i < 50000; i ++) {
          if(a % b ==c) {
            System.out.println("YES");
            break;
          } else {
            a *= a * i;
          }
     }
  }
}