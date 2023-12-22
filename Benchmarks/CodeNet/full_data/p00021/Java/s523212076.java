import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int count = Integer.parseInt(br.readLine());
        while(count > 0){
            String s = br.readLine();
            double x1 = Double.parseDouble(s.split(" ")[0]);
            double y1 = Double.parseDouble(s.split(" ")[1]);
            double x2 = Double.parseDouble(s.split(" ")[2]);
            double y2 = Double.parseDouble(s.split(" ")[3]);
            double x3 = Double.parseDouble(s.split(" ")[4]);
            double y3 = Double.parseDouble(s.split(" ")[5]);
            double x4 = Double.parseDouble(s.split(" ")[6]);
            double y4 = Double.parseDouble(s.split(" ")[7]);
 
            if(isParallell(x1,y1,x2,y2,x3,y3,x4, y4)) System.out.println("YES");
            else                                      System.out.println("NO");
            count--;
        }
    }
    private static boolean isParallell(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        double slope12,slope34;
         
        if((x2-x1)==0) slope12=(y2-y1);
        else slope12 = (y2-y1) / (x2-x1);
        if((x4-x3)==0) slope34=(y4-y3);
        else slope34 = (y4-y3) / (x4-x3);
     
        if(slope12 == slope34) return true;
        else                    return false;
    }
}