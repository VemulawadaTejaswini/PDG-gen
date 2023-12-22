import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
    ArrayList<Integer> p = new ArrayList<Integer>();
    for(int i = 0; i<n; i++) {
      int tmp = sc.nextInt();
      p.add(tmp);
    }
    Collections.sort(p);

    int sum = 0;
    for(int i=0; i<k; i++) {
      sum += p.get(i);
    }
		System.out.println(sum);
	}
}
