import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inData = br.readLine();
        while (!"".equals(inData)) {
            String[] abcdef = inData.split(" ");
            double x = (getDouble(abcdef[1]) * getDouble(abcdef[5])
                    - getDouble(abcdef[2]) * getDouble(abcdef[4]))
                    / (getDouble(abcdef[1]) * getDouble(abcdef[3])
                            - getDouble(abcdef[0]) * getDouble(abcdef[4]));
            double y = (getDouble(abcdef[2]) - getDouble(abcdef[0]) * x) / getDouble(abcdef[1]);
            System.out.printf("%.3f ", x);
            System.out.printf("%.3f\n", y);
            inData = br.readLine();
        }
    }

    private static double getDouble(String d) {
        return Double.parseDouble(d);
    }
}