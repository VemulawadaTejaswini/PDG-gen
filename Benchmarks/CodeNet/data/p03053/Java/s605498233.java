
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    char[][] matrix = new char[h][w];
    Deque<Point> points = new ArrayDeque<Point>();
    for(int i=0;i<h;i++){
      matrix[i] = sc.next().toCharArray();
      for(int j=0;j<w;j++){
        if(matrix[i][j] == '#'){
          points.addLast(new Point(i,j));
        }
      }
    }
    sc.close();
    int count = search(matrix, points, h, w, 0);
    System.out.println(count);
    return;
  }
  public static int search(char[][] matrix, Deque<Point> points, int h, int w, int count){
    Point p;
    Deque<Point> new_points = new ArrayDeque<Point>();
    while(true){
      try{
        p = points.removeFirst();
      }catch(NoSuchElementException e){
        break;
      }
      int x = p.x; int y = p.y;
      matrix[y][x] = '%';
      int[] dx = {-1,0,1,0}; int[] dy = {0,-1,0,1};
      for(int i=0;i<4;i++){
        int nx = x + dx[i]; int ny = y + dy[i];
        if(ny<0 || ny>=h || nx<0 || nx>=w || matrix[ny][nx] != '.'){
          continue;
        }
        matrix[ny][nx] = '#';
        new_points.addLast(new Point(ny,nx));
      }
    }
    try{
      p = new_points.removeFirst();
      count++;
      return search(matrix, new_points, h, w, count);
    }catch(NoSuchElementException e){
      return count;
    }
  }
}
class Point{
  int x; int y;
  public Point(int y, int x){
    this.x = x;
    this.y = y;
  }
}