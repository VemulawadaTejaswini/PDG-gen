import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int total = x + y + z;
    
    if(total > 22){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
    
  }
}
