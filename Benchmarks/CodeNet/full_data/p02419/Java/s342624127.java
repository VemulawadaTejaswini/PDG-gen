import java.io.ByteArrayInputStream;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = getScanner();
    String a = scanner.nextLine().trim().toLowerCase();
    int count = 0;
    while (scanner.hasNext()) {
     String line = scanner.nextLine().trim().toLowerCase();
     if(!"END_OF_TEXT".equals(line)) {
       count += Arrays.stream(line.split(" ")).filter(s -> a.equals(s)).collect(Collectors.toList()).size();
     }
    }
    System.out.println(count);
  }

static Scanner getScanner() {    return new Scanner(System.in);  }
}
