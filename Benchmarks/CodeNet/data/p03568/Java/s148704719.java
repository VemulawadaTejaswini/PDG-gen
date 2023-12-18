import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int odd = 1;
      	for (int i = 0; i < n; i++) {
          	int a = Integer.parseInt(sc.next());
        	if (a % 2 == 0) odd *= 2;
        }
		System.out.println(Math.round(Math.pow(3, n) - odd));
    }
}