import java.io.*;

public class Main {
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String s;
        while ((s = br.readLine()) != null) {
            String[] lc = s.split(" ");
            double x1 = Double.parseDouble(lc[0]);
            double y1 = Double.parseDouble(lc[1]);
            double x2 = Double.parseDouble(lc[2]);
            double y2 = Double.parseDouble(lc[3]);
            double x3 = Double.parseDouble(lc[4]);
            double y3 = Double.parseDouble(lc[5]);
            double xp = Double.parseDouble(lc[6]);
            double yp = Double.parseDouble(lc[7]);
            
            x1 -= xp;
            y1 -= yp;
            x2 -= xp;
            y2 -= yp;
            x3 -= xp;
            y3 -= yp;
            
            double a = x2*y3 - x3*y2;
            double b = x3*y1 - x1*y3;
            double c = x1*y2 - x2*y1;
            
            System.out.println(a*b>0 && a*c>0 ? "YES" : "NO");
        }
 
    }
}