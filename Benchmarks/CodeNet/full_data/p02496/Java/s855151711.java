import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean cards[][] = new boolean[4][13];
    int marknum;
    for (int i = 0; i < n; i++) {
      char mark = sc.next();
      if (mark.equals("S")) {
        marknum = 0;
      }
      else if (mark.equals("H")) {
        marknum = 1;
      }
      else if (mark.equals("C")) {
        marknum = 2;
      }
      else {
        marknum = 3;
      }
      int num = sc.nextInt();
      cards[marknum][num] = true;
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        if (cards[i][j]) {
          if (i == 0) {
            System.out.println("S "+ (j+1));
          }
          else if (i == 1) {
            System.out.println("H "+ (j+1));
          }
          else if (i == 2) {
            System.out.println("C "+ (j+1));
          }
          else {
            System.out.println("D "+ (j+1));
          }
        }
      }
    }
  }
}