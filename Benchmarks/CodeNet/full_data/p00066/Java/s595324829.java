import java.util.*;

class Main{
  public static char chkWin(String str){
    char[][] mark = {{str.charAt(0),str.charAt(1),str.charAt(2)},
                     {str.charAt(3),str.charAt(4),str.charAt(5)},
                     {str.charAt(6),str.charAt(7),str.charAt(8)}};
    for (int i = 0; i < 3; i++) {
      if (mark[i][0] != 's' && mark[i][0] == mark[i][1] &&
                               mark[i][0] == mark[i][2]){
        return mark[i][0];
      }
      else if(mark[0][i] != 's' && mark[0][i] == mark[1][i] &&
                                   mark[0][i] == mark[2][i]){
        return mark[0][i];
      }
    }
    if (mark[1][1] != 's'){
      if(mark[0][0] == mark[1][1] && mark[1][1] == mark[2][2]){
        return mark[2][2];
      }
      else if(mark[0][2] == mark[1][1] && mark[1][1] == mark[2][0]){
        return mark[2][0];
      }
    }
    return 'd';
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String str = sc.next();
      System.out.println(chkWin(str));
    }
  }
}