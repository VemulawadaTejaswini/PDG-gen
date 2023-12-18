import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int s = sc.nextInt();
    int x = -1;
    int y = -1;
    int z = -1;
    int sum = 0;
    int point = 0;
    for(int i = 0;i <= k;i++){
      x++;
      for(int j = 0;j <= k;j++){
        y++;
        if(y > k){
          y = y%3;
        }
        for(int t = 0;t <= k;t++){
          z++;
          if(z > k){
            z = z%3;
          }
          if(x+y+z == s){
            point++;
          }
        }
      }
    }
    System.out.println(point);
  }
}
