import java.util.*;
import java.io.*;
class Main {
 public static void main(String[] args) {
  BufferReader buffer = new BufferReader(new InputStreamReader(System.in));
  String line = buffer.readLine();
   int n = Integer.valueOf(line);
   int result = n % 2 == 0 ? n/2 : (n/2 + 1);
   System.out.println(result);
 }
}