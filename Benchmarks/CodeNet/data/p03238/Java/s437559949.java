import java.util.Scanner;

class test{
  public static void main(String args[]){
    int num;
    int a,b;
    Scanner sc = new Scanner(System.in);
    
    num = sc.nextInt();
    
    if(num == 1){
      System.out.println("Hello World");
    }else if(num == 2){
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println(a + b);
    }
  }
}
    
  