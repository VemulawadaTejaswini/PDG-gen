import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer[] nm = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
    boolean[] mid1 = new boolean[nm[0]+1];
    boolean[] mid2 = new boolean[nm[0]+1];
    Integer[] ab;
    for(int i=0;i<nm[1];i++){
      ab = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
      if (ab[0]==1){
        mid1[ab[1]] = true;
      }
      if (ab[1]==nm[0]){
        mid2[ab[0]] = true;
      }
    }

    for(int i=0;i<nm[0]+1;i++){
      if(mid1[i]&&mid2[i]){
        System.out.println("POSSIBLE");
        return;
      }
    }
    System.out.println("IMPOSSIBLE");
    return ;
  }
}
