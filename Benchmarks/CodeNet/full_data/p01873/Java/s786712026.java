import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> units = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
		        units.add(i);
		        if (i * i != n) {
		            units.add(n / i);
		        }
		    }
		}
		Collections.sort(units);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    for (int j = 0; j < units.size(); ) {
		        int x = units.get(j);
		        if (i - x < 0) {
		            break;
		        }
		        if (arr[i] != arr[i - x]) {
		            units.remove(Integer.valueOf(x));
		        } else {
		            j++;
		        }
		    }
		}
		if (units.size() == 0) {
		    System.out.println(1);
		} else {
		    System.out.println(n / units.get(0));
		}
	}
}

