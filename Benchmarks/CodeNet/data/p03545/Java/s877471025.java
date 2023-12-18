import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int H = in.nextInt();
      int W = in.nextInt();

      int C[][] = new int[12][12];
      int A[][] = new int[H+1][W+1];

      for(int cnt = 0; cnt < 10; cnt++) {
          for(int cnt2 = 0; cnt2 < 10; cnt2++) {
              C[cnt][cnt2] = in.nextInt();
          }
      }

      for(int cnt = 0; cnt < H; cnt++) {
          for(int cnt2 = 0; cnt2 < W; cnt2++) {
              A[cnt][cnt2] = in.nextInt();
          }
      }

      for(int cnt = 0; cnt < H; cnt++) {
          for(int cnt2 = 0; cnt2 < W; cnt2++) {
              int q = A[cnt][cnt2];
              if((q != -1)||(q == 1)) {
                  int min = 100;
                  while(q != 1) {
                      for(int cntd = 0; cntd < 10; cntd++) {
                          int min2 = 100;
                          for(int cntd2 = 0; cntd2 < 10; cntd2++) {
                              int qd = C[q][cnt];
                              if(qd < min2) {
                                  min2 = qd;
                                  min = min + min2;
                              }
                          }
                      }
                  }
              }
          }
      }

  }


}
