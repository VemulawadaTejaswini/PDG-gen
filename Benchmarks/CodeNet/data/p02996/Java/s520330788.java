import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, flag = 0, current = 0;
    number_n = Integer.parseInt(sc.next());
    List<Pair> pair = new ArrayList<Pair>();
    int[] time = new int[number_n];
    int[] goal = new int[number_n];
    for(i = 0; i < number_n; i++) {
      time[i] = Integer.parseInt(sc.next());
      goal[i] = Integer.parseInt(sc.next());
      pair.add(new Pair(time[i], goal[i]));
    }
    pair.sort(Comparator.comparing(Pair::getGoal));
    for(Pair temp : pair) {
      current += temp.time;
      if(temp.goal < current) {
        flag++;
        System.out.println("No");
        break;
      }
    }
    if(flag == 0) System.out.println("Yes");
  }
}

class Pair {
  int time;
  int goal;

  public Pair(int a, int b) {
    this.time = a;
    this.goal = b;
  }

  public int getGoal() {
    return this.goal;
  }
}
