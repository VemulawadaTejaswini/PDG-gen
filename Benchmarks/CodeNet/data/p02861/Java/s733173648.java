import java.util.*;
import java.lang.Math;

class Point {
  int x;
  int y;
}

class Main {
  private static double cost(ArrayList<Point> towns) {
    double c = 0;
    for (int  i= 1; i<towns.size(); i++) {
      int dx = towns.get(i).x - towns.get(i-1).x;
      int dy = towns.get(i).y - towns.get(i-1).y;
      c += Math.sqrt(dx * dx + dy* dy);
    }

    return c;
  }

  private static int factorial(int n) {
    int ret = 1;
    for (int i = n; i > 0; i--) {
      ret *= i;
    }
    return ret;
  }

  public static void _permute(ArrayList<ArrayList<Integer>> all, ArrayList<Integer> unselected, ArrayList<Integer> selected) {
    if (unselected.size() == 0) {
      ArrayList<Integer> _selected = new ArrayList<Integer>();
      for (Integer s : selected) {
        _selected.add(s);
      }
      all.add(_selected);
    }

    for (int i = 0; i < unselected.size(); i++) {
      Integer elem = unselected.remove(i);
      selected.add(elem);
      _permute(all, unselected, selected);
      selected.remove(selected.size() - 1);
      unselected.add(i, elem);
    }
  }

  public static ArrayList<ArrayList<Integer>> permute(int n) {
    ArrayList<Integer> choices = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
      choices.add(i);
    }

    ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>(factorial(n));
    ArrayList<Integer> rest = new ArrayList<Integer>();
    _permute(all, choices, rest);

    return all;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Point> towns = new ArrayList<Point>();
    for (int i = 0; i < n; i++) {
      Point p = new Point();
      p.x = Integer.parseInt(sc.next());
      p.y = Integer.parseInt(sc.next());
      towns.add(p);
    }

    double c = 0;
    ArrayList<ArrayList<Integer>> patterns = permute(n);
    for (ArrayList<Integer> pat : patterns) {
      ArrayList<Point> _towns = new ArrayList<Point>(n);
      for (int i = 0; i < n; i++) {
        _towns.add(towns.get(pat.get(i)));
      }
      c += cost(_towns);
    }
    System.out.println(c / (double)patterns.size());
  }
}