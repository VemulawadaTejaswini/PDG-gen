import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ans = sc.nextLine();
    String NO = "";
    int iAC = 0;
    int iWA = 0;
    int tmpWA = 0;
    boolean tmpAC = false;
    while(sc.hasNext()){
      ans = sc.nextLine();
      String[] array = ans.split(" ",0);
      //新規問題設定
      if (!NO.equals(array[0])){
        tmpWA = 0;
        tmpAC = false;
        NO = array[0];
      }
      //正解済みならスキップ
      if (tmpAC) {
        continue;
      }
      if (array[1].equals("WA")){
        iWA++;
      } else {
        tmpAC = true;
        iAC++;
        iWA = iWA + tmpWA;
      }
    }
    System.out.println(iAC + " " + iWA);
  }
}