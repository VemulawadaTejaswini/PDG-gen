import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int N = stdIn.nextInt(); //N人のすぬけ君
    int K = stdIn.nextInt(); //K種類のお菓子
    
    //d_i及びA_i_diの入力
    int[] di = new int[K];
    int[][] Ai = new int[K][K];
    
    for (int i = 0; i < K; i++){
     di[i] = stdIn.nextInt(); //diの入力
     for ( int j = 0 ; j < di[i] ; j++){
      Ai[i][j] = stdIn.nextInt();
     }
    }
    
    int num = 0 ; //カウンター
    
    for ( int i = 0; i < K; i++){
      for ( int j = 0; j < di[i]; j++){
        for ( int k = 0; k < K; k++){
         for(int l = 0; l < di[i]; l++){
            if(Ai[i][j] == Ai[k][l])
              num = num + 1;
         }
        }
      }
    }
    
    System.out.println((int)num/4);
  }
}
