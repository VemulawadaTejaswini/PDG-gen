import java.util.Scanner;
class Main{
  public static int[][] inkS(int x, int y, int paper[][]){
    paper[x+2][y+1] +=1;
    paper[x+1][y+2] +=1;
    paper[x+2][y+2] +=1;
    paper[x+3][y+2] +=1;
    paper[x+2][y+3] +=1;
    return paper;
  }

  public static int[][] inkM(int x, int y, int paper[][]){
    paper = inkS(x, y, paper);
    paper[x+1][y+1] +=1;
    paper[x+3][y+1] +=1;
    paper[x+1][y+3] +=1;
    paper[x+3][y+3] +=1;
    return paper;
  }

  public static int[][] inkL(int x, int y, int paper[][]){
    paper = inkM(x, y, paper);
    paper[x+2][y  ] +=1;
    paper[x  ][y+2] +=1;
    paper[x+4][y+2] +=1;
    paper[x+2][y+4] +=1;
    return paper;
  }

  public static int[][] ink(int x, int y, int size, int paper[][]){
    switch(size){
      case 1: paper = inkS(x, y, paper);
        break;
      case 2: paper = inkM(x, y, paper);
        break;
      case 3: paper = inkL(x, y, paper);
        break;
    }
    return paper;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] paper = new int[14][14];
    while (sc.hasNext()) {
      String str = sc.next();
      String[] strArr = str.split(",");
      int x = Integer.parseInt(strArr[0]);
      int y = Integer.parseInt(strArr[1]);
      int size = Integer.parseInt(strArr[2]);
      paper = ink(x, y, size, paper);
    }
    int max = 0;
    int white = 0;
    for (int i = 2; i < 12; i++) {
      for (int j = 2; j < 12; j++) {
        if (paper[i][j] == 0) {
          white++;
        }
        if (paper[i][j] > max) {
          max = paper[i][j];
        }
      }
    }
    System.out.println(white);
    System.out.println(max);
  }
}