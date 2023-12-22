import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    long n = scanner.nextLong();

    final StringBuilder s = new StringBuilder();
    long multiplier = 26;
    int i = 0;

    long rest = n;
    while (rest > multiplier) {
      rest -= multiplier;
      multiplier *= 26;
      i++;
    }

    String result = Long.toString(rest - 1, 26)
        .replace("p", "z")
        .replace("o", "y")
        .replace("n", "x")
        .replace("m", "w")
        .replace("l", "v")
        .replace("k", "u")
        .replace("j", "t")
        .replace("i", "s")
        .replace("h", "r")
        .replace("g", "q")
        .replace("f", "p")
        .replace("e", "o")
        .replace("d", "n")
        .replace("c", "m")
        .replace("b", "l")
        .replace("a", "k")
        .replace("9", "j")
        .replace("8", "i")
        .replace("7", "h")
        .replace("6", "g")
        .replace("5", "f")
        .replace("4", "e")
        .replace("3", "d")
        .replace("2", "c")
        .replace("1", "b")
        .replace("0", "a");

    while (result.length() < i + 1) {
      result = "a" + result;
    }

    System.out.println(result);
  }
}
