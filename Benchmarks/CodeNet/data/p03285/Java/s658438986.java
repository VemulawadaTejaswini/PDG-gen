import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mod7 = (n + 6) / 7;
    int mod4 = (n + 3) / 4;
    boolean f = false;
    
    if(n % 7 != 0 || n % 4 != 0){
      for(int j = 1; j < mod7; j++){
        for(int i = 1; i < mod4; i++){
          if(7 * j + 4 * i == n)
            f = true;
        }
      }
    }
    else{
      f = true;
    }
    
    if(f == false)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}
