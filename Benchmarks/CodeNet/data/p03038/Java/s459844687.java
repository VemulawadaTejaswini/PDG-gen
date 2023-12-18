
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		List<Pair> con = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int b = sc.nextInt();
			long c = sc.nextLong();
			con.add(new Pair(c, b));
		}
		con.sort(Comparator.comparing(Pair::getValue).reversed());
		long ans = 0;
		boolean end = false;
		for(Pair pair : con) {
			long value = pair.getValue();
			int sum = pair.getSum();
			while(sum > 0) {
				long first = list.get(0);
				list.remove(0);
				if(value > first) {
					ans += value;
				} else {
					ans += first;
					end = true;
				}
				if(list.isEmpty()) {
					end = true;
					break;
				}
				sum--;
			}
			if(end) {
				break;
			}
		}
		for(Long j : list) {
			ans += j;
		}
		System.out.println(ans);
	}

}

class Pair {
	private long value;
	private int sum;

	protected Pair(long value, int sum) {
		super();
		this.value = value;
		this.sum = sum;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Pair [value=" + value + ", sum=" + sum + "]";
	}

}
