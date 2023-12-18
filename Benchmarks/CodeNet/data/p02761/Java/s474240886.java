import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] sc = new int[m][2];
    for(int i=0; i<m; i++){
      sc[i][0] = in.nextInt();
      sc[i][1] = in.nextInt();
    }
    System.out.println(judge(sc, n, m));
  }

  static int judge(int[][] sc, int n, int m){
    if(n==2 || n==3){
      for(int[] condition: sc){
        if(condition[0] == 1 && condition[1] == 0 ) return -1;
      }
    }
    for(int i=0; i<sc.length; i++){
      int j = 0;
      while(j < m){
        if(i != j && sc[i][0] == sc[j][0] && sc[i][1] != sc[j][1]) return -1;
        j++;
      }
    }

    StringBuilder buf = new StringBuilder();
    int i = 0;
    while(i<n){
    buf.append("x");
    i++;
    }
    String[] x = buf.toString().split("");
    for(int j=0; j<m; j++){
      x[sc[j][0]-1] = Integer.toString(sc[j][1]);
    }
    for(int j=0; j<x.length; j++){
      if(x[j].equals("x")){
        x[j]="0";
      }
    }
    if(x[0]=="0"){
      x[0] = "1";
    }
    String minNum = String.join("", x);
    return Integer.parseInt(minNum);
  }
}
