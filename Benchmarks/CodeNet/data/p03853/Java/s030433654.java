import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String pix[][] = new String[H][W];
    for(int i = 0;i < H;i++){
      for(int j = 0;j < W;j++){
        pix[i][j] = sc.next();
      }
    }

    for(int k = 0;k < H;k++){
      for(int l = 0;l < W;l++){
        if(l != W -1){
          System.out.print(pix[k][l]);
        }else{
          System.out.println(pix[k][l]);
        }
      }
      for(int m = 0;m < W;m++){
        if(m != W -1){
          System.out.print(pix[k][l]);
        }else{
          System.out.println(pix[k][l]);
        }
      }
    }


  }
}
