import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
          int x = in.nextInt();
          int y = in.nextInt();
          int z = in.nextInt();
          int max = 0;
          int min =0;
          if(x>y){
              if(x>z) {
                  max = x;
                  min=z;
              }
              else if(y>z) {
                  max = y;
                  min =z;
              }
              else {
                  max = z;
                  min =y;
              }
          }
          else
          {
              if(y>x)
              {
                  if(y>z) {
                      max = y;
                      min = x;
                  }
                  else {
                      max = z;
                      min=x;
                  }
              }
          }

          String s = Integer.toString(y);
          String t = Integer.toString(z);
          String q = Integer.toString(x);
          if(max==y) {
              String v = s+z;
              System.out.println(Integer.valueOf(v)+x);
          }
          else if(max==z) {
              String r = t+y;
              System.out.println(Integer.valueOf(r)+x);
          }
          else if(max==x){
              String f = q+y;
              System.out.println(Integer.valueOf(f)+z);
          }

        }
    }
}
