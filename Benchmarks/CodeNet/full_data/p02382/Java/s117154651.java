import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int count = Integer.parseInt(br.readLine());
 
        double[] listX = new double[count];
        double[] listY = new double[count];
 
        String[] str01 = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            listX[i] = Double.parseDouble(str01[i]);
        }
 
        String[] str02 = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            listY[i] = Double.parseDouble(str02[i]);
        }
        for (int i = 1; i < 5; i++) {
            Method.math(listX, listY, i);
        }
    }
}
 
class Method {
 
    static void math(double[] listX, double[] listY, int code) {
        double sum = 0;
 
        if (code == 1) {
            for (int i = 0; i < listX.length; i++) {
                sum += Math.abs(listX[i] - listY[i]);
            }
 
        } else if (code == 2) {
            for (int i = 0; i < listX.length; i++) {
                sum += Math.pow((listX[i] - listY[i]), 2);
            }
            sum = Math.sqrt(sum);
 
        } else if (code == 3) {
            for (int i = 0; i < listX.length; i++) {
                sum += Math.pow(Math.abs(listX[i] - listY[i]), 3);
            }
            sum = Math.cbrt(sum);
 
        } else {
            for (int i = 0; i < listX.length; i++) {
                if (sum < Math.abs(listX[i] - listY[i])) {
                    sum = Math.abs(listX[i] - listY[i]);
                }
            }
        }
        System.out.println(sum);
    }
}