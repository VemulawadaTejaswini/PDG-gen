import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int H = scn.nextInt();
    int W = scn.nextInt();
    
    char[][] A = new char[H][W];
    int flag = 0;	// #マスの個数(値がH*Wになれば操作終了)
    for(int i = 0; i < H; i++){
      String temp = scn.next();
      for(int j = 0; j < W; j++){
        A[i][j] = temp.charAt(j);
        if(A[i][j] == '#'){
          flag++;
        }
      }
    }
    
    int ans = 0;
    char[][] nextA = new char[H][W];
    while(flag < H*W){
      for(int i=0; i<H; i++){
        for(int j=0; j<W; j++){
          if(A[i][j] == '.'){
            if(i-1 >= 0 && A[i-1][j] =='#'){
              flag++;
              nextA[i][j] = '#';
            }else if(j-1 >= 0 && A[i][j-1] =='#'){
              flag++;
              nextA[i][j] = '#';
            }else if(i+1 < H && A[i+1][j] =='#'){
              flag++;
              nextA[i][j] = '#';
            }else if(j+1 < W && A[i][j+1] =='#'){
              flag++;
              nextA[i][j] = '#';
            }else{
              nextA[i][j] = '.';
            }
          }else{
            nextA[i][j] = '#';
          }
        }
      }
      for(int i=0; i<W; i++){
        for(int j=0; j<H; j++){
          A[i][j] = nextA[i][j];
        }
      }
      ans++;
    }
    
    System.out.println(ans);
  }
}