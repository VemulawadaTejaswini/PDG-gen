import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        double[] num = new double[4];
        for(int i=0; i<str.length; i++){
            num[i] = Double.parseDouble(str[i]);
        }

        System.out.println(distance(num[0], num[1], num[2], num[3]));
    }
}