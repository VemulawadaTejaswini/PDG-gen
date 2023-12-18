import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    List<Position> positions = new ArrayList<Position>();
    
    int n = sc.nextInt();
    for (int i = 0 ; i < n ; i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      positions.add(new Position(x,y));
    }
    
    int c = 0;
    double distances = 0.0;
    for(int i = 0 ; i < positions.size() ; i++){
      for(int y = 0 ; y < positions.size() ; y++){
        if(i == y){
          continue;
        }
        c++;
        distances += calcDistance(positions.get(i), positions.get(y));
      }
    }
    System.out.println((distances / c));
  }
  
  static double calcDistance(Position a, Position b){
    return Math.sqrt(Math.pow(a.x - b.x) + Math.pow(a.y - b.y));
  }
  
  public class Position{
    public int x;
    public int y;
    
    public Position(int x, int y){
      this.x = x;
      this.y = y;
    }
  }
}