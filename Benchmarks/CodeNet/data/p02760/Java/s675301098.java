import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] a = new int[3][3];

    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        a[i][j] = Integer.parseInt(sc.next());
      }
    }

    boolean[][] b = new boolean[3][3];
    int n = Integer.parseInt(sc.next());

    for(int k=0; k<n; k++){
      int t = Integer.parseInt(sc.next());
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          if(a[i][j] == t)
            b[i][j] = true;
        }
      }
    }

    boolean t = false;
    for(int i=0; i<3; i++){
      if((b[i][0] && b[i][1] && b[i][2])||(b[0][i] && b[1][i] && b[2][i])){
        System.out.println("Yes");
        t = true;
        break;
      }
    }

    if((b[0][0] && b[1][1] && b[2][2] && !t) || (b[2][2] && b[1][1] && b[0][2] && !t)){
      System.out.println("Yes");
        t = true;
    }
    if (!t)
      System.out.println("No");
  }
}
