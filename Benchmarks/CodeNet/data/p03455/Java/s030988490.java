import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      
      int a;
      int b;
      
      Scanner sc1 = new Scanner(System.in);
      a = sc1.nextInt();
      b = sc1.nextInt();
      
      if((a*b) % 2 == 0){
       System.out.println("Even");
      }else if{
       System.out.println("Odd");
      }    
    }
}