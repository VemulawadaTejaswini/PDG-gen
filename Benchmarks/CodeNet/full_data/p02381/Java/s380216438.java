import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
                int n = Integer.parseInt(in.readLine());
                if (n == 0) break;

                double[] arr = Arrays.stream(in.readLine().split(" "))
                        .mapToDouble(Double::parseDouble)
                        .toArray();

                double m = DoubleStream.of(arr).average().getAsDouble();
                double a2 = DoubleStream.of(arr).map(d -> Math.pow((d - m), 2)).sum() / n;
                double a = Math.sqrt(a2);
                System.out.printf("%.8f\n", a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

