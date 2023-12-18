import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(in.readLine());
    Long[][] coords = new Long[N][2];
    long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
    long maxX = 0, maxY = 0;

    long minXY=0, maxXY=0, minYX=0, maxYX=0;
    for(int i=0;i<N;i++){
      coords[i] = Arrays.stream(in.readLine().split(" ")).map(Long::parseLong).toArray(Long[]::new);
      if(minX > coords[i][0]){
        minX = coords[i][0];
        minXY = coords[i][1];
      }
      if(minY > coords[i][1]){
        minY = coords[i][1];
        minYX = coords[i][0];
      }

      if(maxX < coords[i][0]){
        maxX = coords[i][0];
        maxXY = coords[i][1];
      }
      if(maxY < coords[i][1]){
        maxY = coords[i][1];
        maxYX = coords[i][0];
      }
    }
    System.out.println(Math.max(Math.abs(maxXY-minXY),  Math.abs(minYX-maxYX)));

  }
}
