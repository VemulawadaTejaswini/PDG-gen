import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  
  for(int i = 1; i <= 10001; i++){
      int x = scanner.nextInt();
      if(x == 0){
          break;
      }
      System.out.println("Case" + i + ": " + x);
    }
  }
}