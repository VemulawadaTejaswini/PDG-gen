import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        String str = getLine();
        double r = Double.parseDouble(str);
        double s = r * r * Math.PI;
        double l = (r * 2)  * Math.PI;
        System.out.printf("%.6f %.6f\n",s,l);
    }

    public static String getLine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        return str;
    }
}



