import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());

      Function<String,double[]> lineSpliteThenArray =
        s -> Stream.of(s.split(" "))
          .mapToDouble(Double::parseDouble)
          .toArray();

      double[][] vecter =
        br.lines()
          .limit(2)
          .map( lineSpliteThenArray )
          .toArray(double[][]::new);

      double p1 =
        IntStream.range(0, n)
          .parallel()
          .mapToDouble(i -> Math.abs(vecter[0][i] - vecter[1][i]) )
          .sum();

      double p2 = Math.sqrt(
        IntStream.range(0, n)
          .parallel()
          .mapToDouble(i -> Math.pow( vecter[0][i] - vecter[1][i], 2))
          .sum() );

      double p3 = Math.pow(
        IntStream.range(0, n)
        .parallel()
        .mapToDouble(i -> Math.pow( Math.abs(vecter[0][i] - vecter[1][i]), 3d))
        .sum() , 1d/3d );

      double p00 =
        IntStream.range(0, n)
          .parallel()
          .mapToDouble(i -> Math.abs(vecter[0][i] - vecter[1][i]))
          .max()
          .getAsDouble();

      System.out.printf("%.8f\n%.8f\n%.8f\n%.8f\n", p1,p2,p3,p00);
    }
  }

}
