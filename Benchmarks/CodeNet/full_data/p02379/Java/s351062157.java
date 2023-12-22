import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        execute(br);
    }
    static void execute(BufferedReader br) throws Exception {
        do {
            double[] xyxy = convertDouble(br.readLine().split(" "));
            double x1 = xyxy[0];
            double y1 = xyxy[1];
            double x2 = xyxy[2];
            double y2 = xyxy[3];
            double a = Math.abs(x1 - x2);
            double b = Math.abs(y1 - y2);
            double c = Math.pow(a, 2) + Math.pow(b, 2);
            System.out.println(Math.sqrt(c));
        } while (br.ready());   
    }
    static double[] convertDouble(String[] str) {
        double[] doubles = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            doubles[i] = Double.parseDouble(str[i]);
        }
        return doubles;
    }
}