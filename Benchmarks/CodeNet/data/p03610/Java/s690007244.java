import java.io.*;
import java.util.*;

class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String result = "";
    for (int i = 0; i < s.length(); i += 2)
    {
      result = result + s.charAt(i);
    }
    System.out.println(result);
  }
}
