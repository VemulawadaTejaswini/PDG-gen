import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.imageio.IIOException;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String word = br.readLine();
      Function<String,Long> findingWord =
        s -> Stream.of(s.split(" "))
          .filter(w -> word.equals(w))
          .collect(Collectors.counting());

      Long result =
        br.lines()
          .filter(w -> !"END_OF_TEXT".equals(w))
          .map(findingWord)
          .count();

      System.out.println(result);
    }
  }
}
