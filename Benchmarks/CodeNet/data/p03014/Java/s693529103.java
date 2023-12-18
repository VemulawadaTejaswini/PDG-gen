import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int [][] map = new int[H][W];
    Mark [][] yokomap = new Mark[H][W];
    Mark [][] tatemap = new Mark[H][W];
    String line = sc.nextLine();
    for(int i=0;i<H;i++){
      line = sc.nextLine();
      for(int j=0;j<W;j++){
        if(line.charAt(j)=='.'){
          if(j>0 && yokomap[i][j-1] != null){
            yokomap[i][j] = yokomap[i][j-1];
          }else{
            yokomap[i][j] = new Mark();
          }
          yokomap[i][j].cnt++;
          if(i>0 && tatemap[i-1][j] != null){
            tatemap[i][j] = tatemap[i-1][j];
          }else{
            tatemap[i][j] = new Mark();
          }
          tatemap[i][j].cnt++;
        }
      }
    }
    int ans = 0;
    for(int i=0;i<H;i++){
      for(int j=0;j<H;j++){
        if(tatemap[i][j] != null){
          ans = Math.max(ans, tatemap[i][j].cnt + yokomap[i][j].cnt - 1);
          System.out.print(tatemap[i][j].cnt + yokomap[i][j].cnt);
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    System.out.println(ans);
  }
  private static class Mark{
    public int cnt;
    Mark(){
      this.cnt=0;
    }
  }
}
