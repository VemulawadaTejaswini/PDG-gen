import java.util.*;

public class Main{
  
  public static void main (String[] args){
    
    Main main = new Main();
    main.solve();
  }
  
  private void solve(){
    
    Scanner scanner = new Scanner (System.in);
    
    int N = scanner.nextInt();
    
    double goukei = 0;
    for (int index=0; index<N; index++){
      double money = scanner.nextDouble();
      String type= scanner.next();
      if (type.equals("JPY")){
        goukei+=money;
      } else {
        goukei+=money*380000.0;
      }
    }
    System.out.println(goukei);
  }
}