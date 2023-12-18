import java.util.*;

public class Main {
  
  public static void main (String[] args){
  
  Scanner scanner = new Scanner (System.in);
  
  int R = scanner.nextInt();
  int G = scanner.nextInt();
    
  //今のレート＋パフォーマンス＝結果レート＊２
  //パフォーマンス＝結果レート＊２－今のレート
    
  int performance = G*2-R;
   
  System.out.println(performance);
  
  }
}