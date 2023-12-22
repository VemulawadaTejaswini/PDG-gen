import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        double a = Integer.parseInt(strArr[0]);
        double b = Integer.parseInt(strArr[1]);

        int div = (int)a / (int)b;
        int rem = (int)a % (int)b;
        double divDbl = a / b;

        System.out.printf("%d %d %.5f", div,rem,divDbl);

    }
}