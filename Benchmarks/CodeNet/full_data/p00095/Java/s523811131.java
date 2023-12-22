import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = scanner.nextInt();
    scanner.nextLine();
    List<String> a = new ArrayList<String>();
    for (int ii = 0; ii < n; ii++) {
      String line = scanner.nextLine();
      String[] works = line.split(" ");
      works[0] = "00" + works[0];
      works[0] = works[0].substring(works[0].length() - 2);
      works[1] = "000" + works[1];
      works[1] = works[1].substring(works[1].length() - 3);
      a.add(works[1] + " " + works[0]);
      Collections.sort(a);
      Collections.reverse(a);
    }
    List<String>aa = new ArrayList<String>();
    String[] tops = a.get(0).split(" ");
    for (String el : a) {
      String[] works = el.split(" ");
      if (!works[0].equals(tops[0])) {
        break;
      }
      aa.add(works[1] + " " + works[0]);
    }
    Collections.sort(aa);
    System.out.println(Integer.parseInt(aa.get(0).split(" ")[0]) + " " + Integer.parseInt(aa.get(0).split(" ")[1]));
  }
}