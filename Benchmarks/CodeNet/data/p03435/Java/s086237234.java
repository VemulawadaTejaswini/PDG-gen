import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
	  int[][] c = new int[3][3];
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          c[i][j]=sc.nextInt();
        }
      }
      String ans = "Yes";
      int d1 = c[0][0]-c[0][1];
      int d2 = c[0][1]-c[0][2];
      if(c[1][0]-c[1][1]==d1){
        ans = "No";
      }
      if(c[2][0]-c[2][1]==d1){
        ans = "No";
      }
      if(c[1][1]-c[1][2]==d2){
        ans = "No";
      }
      if(c[2][1]-c[2][2]==d2){
        ans = "No";
      }
      System.out.println(ans);
    }
}