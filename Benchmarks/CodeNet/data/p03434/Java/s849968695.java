import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> a = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      int ai = sc.nextInt();
      a.add(ai);
    }

    Collections.sort(a, Collections.reverseOrder());

    int answer = 0;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        answer += a.get(i);
      } else {
        answer -= a.get(i);
      }
    }

    System.out.println(answer);
  }
}
