import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N <= 81){
      for(int i=2; i<10; i++){
        if(N % 2 == 0){
          System.out.println("Yes");
          return;
        }
      }
    }
    
    System.out.println("No");
  }
}