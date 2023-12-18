import java.util.Comparator;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int X = Integer.parseInt(str.split(" ")[0]);
		int A = Integer.parseInt(str.split(" ")[1]);

		int ans = 10;

		if(X<A){
			ans = 0;
		}



		System.out.println(ans);


	}

	//2次元配列
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
