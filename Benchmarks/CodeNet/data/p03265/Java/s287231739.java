import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int x1 = Integer.parseInt(line[0]);
        int y1 = Integer.parseInt(line[1]);
        int x2 = Integer.parseInt(line[2]);
        int y2 = Integer.parseInt(line[3]);
        int x3 = 0, x4 = 0, y3 = 0, y4 = 0, dis= 0;
        
        if (x1 == x2) {
            dis = Math.abs(y1-y2);
            x3 = x4 = x1 - dis;
            y3 = y2;
            y4 = y1;
        }
        else if (y1 == y2) {
            dis = Math.abs(x1-x2);
            x3 = x2;
            x4 = x1;
            y3 = y4 = y1 + dis;
        }
        else {
            //int l = (int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            //int ydif = (int)Math.y3 = y2+ydif/2;
            //int xdif = (int)Math.sqrt(l*l + (y2-y1)*(y2-y1));
            if (x2>=x1) {
                if (y2>=y1) {
                    int xdif = y2-y1;
                    int ydif = x2-x1;
                    x3 = x2 - xdif;
                    x4 = x3 - ydif;
                    y3 = y2 + ydif;
                    y4 = y3 -xdif;
                }
                else {
                    int xdif = y2-y1;
                    int ydif = x1-x2;
                    x3 = x2 + xdif;
                    x4 = x3 + ydif;
                    y3 = y2 - ydif;
                    y4 = y3 +xdif;
                }
            }
            else {
                if (y2>=y1) {
                    int xdif = y2-y1;
                    int ydif = x1-x2;
                    x3 = x2 - xdif;
                    x4 = x3 + ydif;
                    y3 = y2 - ydif;
                    y4 = y3 - xdif;
                }
                else {
                    int xdif = y2-y1;
                    int ydif = x1-x2;
                    x3 = x2 + xdif;
                    x4 = x3 - ydif;
                    y3 = y2 + ydif;
                    y4 = y3 + xdif;
                }
            }
        }
        //System.out.println(slope2);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4) ;
        
    }
}
