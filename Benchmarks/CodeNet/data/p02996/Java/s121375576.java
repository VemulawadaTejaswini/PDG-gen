import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		long n = Long.parseLong(str);

		Data[] ab = new Data[(int)n];

		for(int i = 0; i < n;i++) {
			str = scan.nextLine();
			ab[i] = new Data(Long.parseLong(str.split(" ")[0]), Long.parseLong(str.split(" ")[1]));
		}

		Arrays.sort(ab, new MyComparator());
		long sum = 0;
		long dead = 0;
		String yes = "Yes";
		for(int i = 0; i < n; i++) {
			sum += ab[i].a;
			dead = ab[i].b;
			//System.out.println("sum:" + sum + " dead:" + dead);
			if(sum > dead ) {
				yes = "No";
				break;
			}
		}

		System.out.println(yes);


	}

	public static class Data  {
        long a, b;
        public Data(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }
    // Comparator インターフェースを実装する
    public static class MyComparator implements Comparator<Data> {
        public int compare(Data d1, Data d2) {
            if (d1.b == d2.b) {
                return (int)(d1.a - d2.a);
            } else {
                return (int)(d1.b - d2.b);
            }

        }
    }

}
