import java.util.*;

public class Main {

	int N;
	long A, B;
	char[] aBit, bBit;
	boolean isEnable = false;
	boolean nowTrans = true;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = in.nextLong();
		B = in.nextLong();
		in.close();
		this.aBit = toBitArray(A);
		this.bBit = toBitArray(B);
		if (this.getDiff(aBit, bBit) % 2 == 1) {
			this.isEnable = true;
		} else {
			this.isEnable = false;
		}
	}

	void show() {
		long val = Long.parseLong(new String(aBit), 2);
		System.out.print(val + " ");

		if (getDiff(aBit, bBit) > 0) {
			// 近づける
			int index = -1;
			for (int i = N; i >= 0; --i) {
				if (aBit[i] != bBit[i]) {
					index = i;
					break;
				}
			}
			aBit[index] = bBit[index];
		} else {
			// 最後だけ変える
			if (aBit[aBit.length - 1] == '0') {
				aBit[aBit.length - 1] = '1';
			} else {
				aBit[aBit.length - 1] = '0';
			}
		}
	}

	char[] toBitArray(long val) {
		char[] result = new char[N + 1];
		Arrays.fill(result, '0');
		for (int i = N; i >= 0; --i) {
			if (val % 2 == 1) {
				result[i] = '1';
			}
			val >>= 1;
		}
		return result;
	}

	int getDiff(char[] aBit, char[] bBit) {
		int diff = 0;
		for (int i = 0; i < aBit.length; ++i) {
			if (aBit[i] != bBit[i]) {
				++diff;
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		if (!ins.isEnable) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			long max = (long) (Math.pow(2.0, (double) (ins.N)));
			for(long i = 0; i < max; ++i) {
				ins.show();
			}
			System.out.println("");
		}

	}

}