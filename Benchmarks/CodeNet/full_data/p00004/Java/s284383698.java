import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str;
            while ((str = br.readLine()) != null)  {
                String[] num = str.split(" ", 0);
                if(num.length==6){
                int a = Integer.parseInt(num[0]);
                int b = Integer.parseInt(num[1]);
                int c = Integer.parseInt(num[2]);
                int d = Integer.parseInt(num[3]);
                int e = Integer.parseInt(num[4]);
                int f = Integer.parseInt(num[5]);
                double x = (c*e-b*f)/(1.0*(a*e-b*d));
                double y = (-c*d+a*f)/(1.0*(a*e-b*d));
                System.out.printf("%.3f %.3f",x,y);
                System.out.println("");
                }
            }
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}