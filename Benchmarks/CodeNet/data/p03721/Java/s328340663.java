import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String[] param = scan.nextLine().split(" ");

    int n = Integer.parseInt(param[0]);
    int k = Integer.parseInt(param[1]);

    ArrayList<Element> e = new ArrayList<Element>();

    for (int i = 0; i < n ; i++){
        String[] elem = scan.nextLine().split(" ");
        e.add(new Element(Integer.parseInt(elem[0]), Integer.parseInt(elem[1]) ) );
    }

    Collections.sort(e);

    int minNum = 0;
    int m = 1;

    for (Element el : e) {
        if (m <= k && m + el.b > k){
          minNum = el.a;
        }
        m += el.b;
    }

    System.out.println(minNum);
  }

}

 class Element implements Comparable<Element> {
    public int a;
    public int b;

    public Element (int a, int b){
      this.a = a;
      this.b = b;
    }

    public int compareTo (Element e) {
      return this.a > e.a ? +1 : this.a < e.a ? -1 : 0;
    }
  }
