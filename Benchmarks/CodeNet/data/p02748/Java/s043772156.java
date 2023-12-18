import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String first = reader.readLine();
			String[] farray = first.split(" ");
			int A = Integer.parseInt(farray[0]);
			int B = Integer.parseInt(farray[1]);
			int M = Integer.parseInt(farray[2]);
			long[] a_prices = new long[A];
			long[] b_prices = new long[B];

			//a
			String second = reader.readLine();
			String[] seconds = second.split(" ");
			for(int i=0; i<A; i++) {
				a_prices[i] = Long.parseLong(seconds[i]);
			}

			//b
			String third = reader.readLine();
			String[] thirds = third.split(" ");
			for(int i=0; i<B; i++) {
				b_prices[i] = Long.parseLong(thirds[i]);
			}

			class Set{
				int a_number;
				int b_number;
				long c = 0;

				Set(int n1, int n2){
					a_number = n1;
					b_number = n2;
				}

				long getPrice() {
					return a_prices[a_number] + b_prices[b_number] - c;
				}
			}

			Set[] setarray = new Set[A*B];

			int q=0;
			for(int i=0; i<A; i++) {
				for(int j=0; j<B; j++) {
					setarray[q] = new Set(i, j);
					q++;
				}
			}


			for(int i=0; i<M; i++) {
				String line = reader.readLine();
				String[] array = line.split(" ");
				int x = Integer.parseInt(array[0]);
				int y = Integer.parseInt(array[1]);
				long cc = Long.parseLong(array[2]);

				if(cc > setarray[B*(x-1) + (y-1)].c)
					setarray[B*(x-1) + (y-1)].c = cc;
			}

			//priceで昇順ソート
			Arrays.sort(setarray, Comparator.comparing(Set::getPrice));

			System.out.println(setarray[0].getPrice());

		}catch(IOException e) {

		}
	}

}
