import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int answer = 700;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'o') {
        answer += 100;
      }
    }

    System.out.println(answer);
  }
}
