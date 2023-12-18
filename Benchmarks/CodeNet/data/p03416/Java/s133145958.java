import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

    int cnt = 0;
    for (int i = a; i <= b; i++) {
        if (isPalindrome(i)) {
          cnt++;
        }
    }

    System.out.println(cnt);
	}

  private static boolean isPalindrome(int x) {
    List<Integer> list = new ArrayList<Integer>();
    while (x > 0) {
      list.add(x - (x / 10 * 10));
      x /= 10;
    }

    int size = list.size();
    for (int i = 0; i < size / 2; i++) {
      if (list.get(i) != list.get(size - 1 - i)) {
				return false;
			}
    }
    return true;
  }
}
