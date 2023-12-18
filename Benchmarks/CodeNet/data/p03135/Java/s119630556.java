import java.util.*;

public class Main{
  
  public static void main (String[] args){
    
    Main main = new Main();
    
    main.solve();
  }
  
  private void solve(){
    Scanner scanner = new Scanner(System.in);
    
    int X = scanner.nextInt();
    int T = scanner.nextInt();
    
    double answer;
    
    answer=(double)X/T;
    System.out.println(answer);
  }
}