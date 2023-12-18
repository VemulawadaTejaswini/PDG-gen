import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public final class Main {

  private Main() {}
  
  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FileDescriptor.in)))) {
      final String source = reader.readLine();
      try {
        int input = Integer.parseInt(source);

        int result = IntStream.iterate(0, Math::incrementExact)
            .filter(i -> i != 0)
            .filter(i -> (i & 1) == 0)
            .filter(i -> (i % input) == 0)
            .findFirst()
            .orElseThrow(RuntimeException::new);

        System.out.println(result);
      } catch (NumberFormatException exception) {
        throw new InternalError("\"" + source + "\" is not a valid number.");
      }
    }
  }

}
