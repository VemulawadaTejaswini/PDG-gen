import java.util.*;

public class Main {
  public static void main(String[] args){
    List<String> l = new ArrayList<>();
    l.add("A");
    l.add("B");
    l.add("C");
    l.add("D");
    l.add("E");
    l.add("F");
    l.add("G");
    l.add("H");
    l.add("I");
    l.add("J");
    l.add("K");
    l.add("L");
    l.add("N");
    l.add("M");
    l.add("O");
    l.add("P");
    l.add("Q");
    l.add("R");
    l.add("S");
    l.add("T");
    l.add("U");
    l.add("V");
    l.add("W");
    l.add("X");
    l.add("Y");
    l.add("Z");


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String[] b = sc.next().split("");

    for (String s : b) {
      if(s.equals("")) continue;
      int c = l.indexOf(s);
      System.out.println(l.get((c+a)%26));
    }

    sc.close();
  }
}
