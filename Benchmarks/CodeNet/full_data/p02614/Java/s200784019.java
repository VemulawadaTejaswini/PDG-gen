import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    int c = scan.nextInt();
    int k = scan.nextInt();
    int l = c*r;
    String[][] f = new String[r][c];
    for (int p=0;p<r;p++){
      String dd = scan.next();
      for (int q=0;q<c;q++){
        char gg = dd.charAt(q);
        f[p][q] = Character.toString(gg);
      }
    }
    int g = (int) Math.pow(2,r);
    int m = (int) Math.pow(2,c);
    int count = 0;
    for (int i=0;i<g;i++){
      int[] a = encode(i,r);
      for (int j=0;j<m;j++){
        int [] b = encode(j,c);
        count += check(f,a,b,k);
      }
    }
    System.out.println(count);
  }


  public static int[] encode(int n,int g){
    int [] a = new int[g];
    int count = 0;
    while (n>0){
      int i = n%2;
      a[count] = i;
      n -= i;
      count++;
      n = (int) n/2;
    }
    return a;
  }

  public static int check(String[][]a, int[] b, int[] c ,int g){
    int sum = 0;
    for (int i=0;i<b.length;i++){
      if (b[i] == 0){
        continue;
      }
      for (int j=0;j<c.length;j++){
        if (c[j] == 0){
          continue;
        }
        if (a[i][j].equals("#")){
          sum += 1;
        }
      }
    }

    if (sum == g){
      return 1;
    }
    return 0;
  }
}
