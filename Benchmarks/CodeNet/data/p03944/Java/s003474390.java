import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int i, j;
    
    int w = scan.nextInt();
    int h = scan.nextInt();
    int n = scan.nextInt();
    
    int[][] b = new int[n][3];
    
    for(i = 0; i < n; i++){
      for(j = 0; j < 3; j++){
        b[i][j] = scan.nextInt();
      }
    }
    
    int maxx = 0;
    int minx = w;
    int maxy = 0;
    int miny = h;
    int ans;
    
    for(i = 0; i < n; i++){
      if(b[i][2] == 1 && maxx < b[i][0]){
        maxx = b[i][0];
      }
      else if(b[i][2] == 2 && minx > b[i][0]){
        minx = b[i][0];
      }
      else if(b[i][2] == 3 && maxy < b[i][1]){
        maxy = b[i][1];
      }
      else if(b[i][2] == 4 && miny > b[i][1]){
        miny = b[i][1];
      }
    }
    
    if(maxx >= minx || maxy >= miny){
      System.out.println("0");
    }
    else{
      ans = (minx - maxx) * (miny - maxy);
      System.out.println(ans);
    }
  }
}