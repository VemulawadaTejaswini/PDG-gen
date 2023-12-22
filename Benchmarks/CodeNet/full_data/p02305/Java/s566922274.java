import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Intersection {
  public static void main(String[] args) {
    try {
      BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));

      String line1;
      line1 = stdReader.readLine();
      String[] data1 = line1.split(" ", 0);
      double cx1 = Double.parseDouble(data1[0]);
      double cy1 = Double.parseDouble(data1[1]);
      double r1 = Double.parseDouble(data1[2]);

      String line2;
      line2 = stdReader.readLine();
      String[] data2 = line2.split(" ", 0);
      double cx2 = Double.parseDouble(data2[0]);
      double cy2 = Double.parseDouble(data2[1]);
      double r2 = Double.parseDouble(data2[2]);

      Double distance = new Double( Math.sqrt(Math.pow(cx1-cx2, 2) + Math.pow(cy1-cy2, 2)) );
      Double maxr = Math.max(r1, r2);
      Double minr = Math.min(r1, r2);

      switch (distance.compareTo(r1+r2)){
        case 1:
          System.out.println(4);
          break;

        case 0:
          System.out.println(3);
          break;

        case -1:
          switch (maxr.compareTo(distance+minr)){
            case -1:
              System.out.println(2);
              break;
            case 0:
              System.out.println(1);
              break;
            case 1:
              System.out.println(0);
              break;
          }
          break;

      }

      stdReader.close();
    } catch (Exception e) {
      e.getStackTrace();
      System.exit(-1); // プログラムを終了
    }
  }
}

