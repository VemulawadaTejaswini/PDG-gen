import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] line;
      int dt,dg=0,bdg=90;
      double x=0,y=0,rd;
      while ( true ) {
        line = br.readLine().split(",");
        dt = parseInt(line[0]);
        dg = parseInt(line[1]);

        if(dt == 0 && dg == 0) break;

        rd = Math.toRadians(bdg);
        x += dt * Math.cos(rd);
        y += dt * Math.sin(rd);

        // String loc = String.format("% 03.2f % 03.2f :% 02d % 02d:%d % 03.2f % 03.2f",
        //   location[0],location[1],dt,dg,bdg,dt * Math.cos(rd),dt * Math.sin(rd));
        // System.out.println(loc);
        bdg -= dg;
      }

      System.out.println((int)x + "\n" +(int)y);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}
