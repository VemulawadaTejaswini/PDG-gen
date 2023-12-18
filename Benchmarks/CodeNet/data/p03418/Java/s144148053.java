import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n, k, ind, i, j, count;
      String str;

      str = reader.readLine();
      ind = str.indexOf(" ");
      n = Integer.parseInt(str.substring(0, ind));
      k = Integer.parseInt(str.substring(ind+1));

      int a[][] = new int[n][n]

      for(i=0; i<=n-1; i++){
        for(j=0; j<=n-1; j++){
          a[i][j]=(i+1)%(j+1);
        }
      }

      for(i=0; i<=n-1; i++){
        for(j=0; j<=n-1; j++){
          if(a[i][j]>=k){
            count = ++count;
          }
        }
      }

      System.out.println(count);

    }
    catch (Exception e) {

    }
  }
}
