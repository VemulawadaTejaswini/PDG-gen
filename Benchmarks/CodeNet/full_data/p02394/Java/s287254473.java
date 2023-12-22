import java.io.*;

class Main {

     private static BufferedReader br;
     private static int W;
     private static int H;
     private static int x;
     private static int y;
     private static int r;
     private static String output;
     private static String[] data = new String[5];

     private static void initialize() {
          br = new BufferedReader(new InputStreamReader(System.in));
          output = "No";
          for (String d : data)
               d = null;
     }

     private static void transInt() {
          W = Integer.parseInt(data[0]);
          H = Integer.parseInt(data[1]);
          x = Integer.parseInt(data[2]);
          y = Integer.parseInt(data[3]);
          r = Integer.parseInt(data[4]);
     }

     private static int judge(int x, int maxX, int r) {
          if (x-r >= 0 && x+r <= maxX) return 0;
          return 1;
     }

     public static void main(String[] args) {
          initialize();
          try {
               data = (br.readLine()).split(" ");
               transInt();
               if ((judge(x, W, r) + judge(y, H, r)) == 0) output = "Yes";
               System.out.println(output);
          } catch(IOException e) {
          } finally {
               try {
                    br.close();
               } catch(IOException e) {
               }
          }
     }

}