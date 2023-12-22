import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    
    if(x >= 30){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    scanner.close();
    return;
  }
  
}
