import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nk = scanner.nextLine();
    String s = scanner.nextLine();
    int toLowerCaseIdx = Integer.parseInt(nk.split(" ")[1]);
    StringBuilder sb = new StringBuilder(s);
    sb.replace(toLowerCaseIdx,toLowerCaseIdx,sb.substring(toLowerCaseIdx,toLowerCaseIdx).toLowerCase());
    System.out.println(s);
  }
}