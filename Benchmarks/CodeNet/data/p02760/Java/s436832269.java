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

    int n = Integer.parseInt(sc.next());

    for(int k=0; k<n; k++){
      int t = Integer.parseInt(sc.next());

      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          if(a[i][j] == t)
          a[i][j] = 0;
        }
      }
    }

    for(int i=0; i<3; i++){
      if((a[i][0] + a[i][1] + a[i][2] == 0)|| (a[0][i] + a[1][i] + a[2][i] == 0)){
        System.out.println("Yes");
        break;
      }
      if(i==0 &&((a[0][0] + a[1][1] + a[2][2]  == 0) || (a[0][2] + a[1][1] +a[2][0] ==0 ))){
        System.out.println("Yes");
        break;
      }
      if (i==2)
      System.out.println("No");
    }
  }
}
