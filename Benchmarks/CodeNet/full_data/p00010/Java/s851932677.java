import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            int n = Integer.parseInt(st);
            for(int i = 0;i<n;i++){
                st = br.readLine();
                String[] s = st.split(" ", 0);
                double x1=Double.parseDouble(s[0]);
                double y1=Double.parseDouble(s[1]);
                double x2=Double.parseDouble(s[2]);
                double y2=Double.parseDouble(s[3]);
                double x3=Double.parseDouble(s[4]);
                double y3=Double.parseDouble(s[5]);
                double A = 2*(x1-x2);
                double B = 2*(y1-y2);
                double C = (x1*x1-x2*x2)+(y1*y1-y2*y2);
                double D = 2*(x1-x3);
                double E = 2*(y1-y3);
                double F = (x1*x1-x3*x3)+(y1*y1-y3*y3);
                double px= Math.round(((B*F-C*E)/(B*D-A*E))*1000)/1000.0;
                double py= Math.round(((C*D-A*F)/(B*D-A*E))*1000)/1000.0;
                double r = Math.round((Math.sqrt(Math.pow(px-x1, 2)+Math.pow(py-y1, 2)))*1000)/1000.0;
                System.out.printf("%.3f %.3f %.3f",px,py,r);
                System.out.println("");
            }
        }catch(IOException e){
            
        }
    }
}