import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[3][3];
    for(int i = 0;i < 3;i++){
      for(int x = 0;x < 3;x++){
        a[i][x] = sc.nextInt();
      }
    }
    boolean[][] flag = new boolean[3][3];
    boolean ans = false;
    int n = sc.nextInt();
    int[] b = new int[n];
    for(int j = 0;j < n;j++){
      b[j] = sc.nextInt();
    }
    for(int y = 0;y < 3;y++){
      for(int z = 0;z < 3;z++){
        for(int c = 0;c < n;c++){
          if(a[y][z] == b[c]){
            flag[y][z] = true;
          }
        }
      }
    }
    for(int p = 0;p < 3;p++){
      if(flag[p][0] == true && flag[p][1] == true && flag[p][2] == true) ans = true;
      if(flag[0][p] == true && flag[1][p] == true && flag[2][p] == true) ans = true;
    }
    if(flag[0][0] == true && flag[1][1] == true && flag[2][2] == true)
      ans = true;
    if(flag[0][2] == true && flag[1][1] == true && flag[2][0] == true)
      ans = true;
    if(ans){
      System.out.println("Yes");        
    }else{
      System.out.println("No");        
    }
  }
}