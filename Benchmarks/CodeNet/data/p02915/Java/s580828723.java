import java.io.*;
import java.util.*;

public class main {
public static void main(String[] args) throws IOException {
  Scanner sc = new Scanner(System.in);
  PrintWriter pw = new PrintWriter(System.out);
  int n = sc.nextInt();
  pw.println(n*n*n);
  sc.close();
  pw.close();
}
}