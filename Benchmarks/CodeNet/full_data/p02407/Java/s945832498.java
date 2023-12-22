import java.util.Scanner;

/*
class ToiN implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool();

	}
}
  */

interface Toi {
	public void exec(String[] args);
}

public class Main {
	public static void main(String[] args) {
		Toi toi = new Toi21();
		toi.exec(args);
	}
}

class Tool {
	Scanner sc;

	public Tool() {
		sc = new Scanner(System.in);
	}

	public void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
			} catch (Exception e) {
				break;
			}
		}
	}

	public void inputArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextLong();
			} catch (Exception e) {
				break;
			}
		}
	}

	public void inputArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.next();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(short[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextShort();
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool17 extends Tool {
	Scanner sc;

	public Tool17() {
		sc = new Scanner(System.in);
	}

	public void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
				if(i % 2 == 1 && array[i] == 0 && array[i-1] == 0){
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}

	public void inputArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
				if(i % 2 == 1 && array[i] == 0 && array[i-1] == 0){
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Toi8 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		Scanner sc = new Scanner(System.in);
		int[] whxyr = new int[5];
		for (byte i = 0; i < whxyr.length; i++) {
			whxyr[i] = sc.nextInt();
		}
		calc(whxyr);
		int[] renewWh = { whxyr[0] - whxyr[4], whxyr[1] - whxyr[4], whxyr[2] + whxyr[4], whxyr[3] + whxyr[4] };
		if (renewWh[0] >= 0 && renewWh[1] >= 0 && renewWh[2] <= whxyr[0] && renewWh[3] <= whxyr[1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public void calc(int[] array) {
		int tmp;
		for (byte i = 0; i < array.length - 2; i++) {
			if (array[i + 2] < 0) {
				tmp = array[i];
				array[i] = array[i + 2];
				array[i + 2] = tmp;
			}
		}
		return;
	}
}

class Toi9 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		for (short i = 0; i < 1000; i++) {
			System.out.println("Hello World");
		}
	}
}

class Toi10 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		short[] tmp = new short[10000];
		Scanner sc = new Scanner(System.in);
		for (short i = 0; i < 10000; i++) {
			try {
				tmp[i] = sc.nextShort();
				if (tmp[i] == 0) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
		for (short i = 1; i <= 10000; i++) {
			if (tmp[i - 1] == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + tmp[i - 1]);
		}
	}
}

class Toi11 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		short[] xy = new short[6000];
		Scanner sc = new Scanner(System.in);
		short point = 0;
		for (short i = 0; i < 3000; i++) {
			try {
				xy[i] = sc.nextShort();
				xy[i + 3000] = sc.nextShort();
			} catch (Exception e) {
				break;
			}
			if (xy[i] == 0 && xy[i + 3000] == 0) {
				point = i;
				break;
			}
		}
		for (short i = 1; i <= point; i++) {
			if (xy[i - 1] < xy[i + 3000 - 1]) {
				System.out.println(xy[i - 1] + " " + xy[i + 3000 - 1]);
			} else {
				System.out.println(xy[i + 3000 - 1] + " " + xy[i - 1]);
			}
		}
	}
}

class Toi12 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		short[] abc = new short[5];
		Scanner sc = new Scanner(System.in);
		for (byte i = 0; i < 3; i++) {
			abc[i] = sc.nextShort();
		}
		short[] f = new short[5000];
		for (short i = 0; i < 5000; i++) {
			f[i] = 0;
		}
		calc(abc[2], f);
		short count = 0;
		for (short i = 0; i < 5000; i++) {
			if (f[i] >= abc[0] && f[i] <= abc[1]) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println(count);
	}

	public void calc(short inputNum, short[] outputArray) {
		for (short i = 1, j = 0; i <= inputNum; i++) {
			if (inputNum % i == 0) {
				outputArray[j] = i;
				j++;
			}
		}
	}
}

class Toi13 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		int[] ab = new int[2];
		Tool tool = new Tool();
		tool.inputArray(ab);
		double[] cd = { ab[0], ab[1] };
		System.out.print(ab[0] / ab[1] + " " + ab[0] % ab[1] + " ");
		System.out.printf("%.5f\n", cd[0] / cd[1]);
	}
}

class Toi14 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		double r = (new Scanner(System.in).nextDouble());
		System.out.printf("%.6f", Math.pow(r, 2) * Math.PI);
		System.out.print(" ");
		System.out.printf("%.6f\n", r * 2. * Math.PI);
	}
}

class Toi15 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		String[] aOpB = new String[3];
		Tool tool = new Tool();
		int[] ab = new int[2];
		int i = 0;
		long[] solved = new long[1000];
		for (int j = 0; j < solved.length; j++) {
			solved[j] = (long) (Math.pow(20000, 2)) * (-1);
		}
		while (true) {
			tool.inputArray(aOpB);
			ab[0] = Integer.parseInt(aOpB[0]);
			ab[1] = Integer.parseInt(aOpB[2]);
			try {
				if (aOpB[1].equals("+")) {
					solved[i++] = ab[0] + ab[1];
				} else if (aOpB[1].equals("-")) {
					solved[i++] = ab[0] - ab[1];
				} else if (aOpB[1].equals("*")) {
					solved[i++] = ab[0] * ab[1];
				} else if (aOpB[1].equals("/")) {
					solved[i++] = ab[0] / ab[1];
				} else if (aOpB[1].equals("?")) {
					break;
				} else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
		i = 0;
		while (true) {
			try {
				if (solved[i] > (long) (Math.pow(20000, 2)) * (-1)) {
					System.out.println(solved[i++]);
				} else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Toi16 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		Tool tool = new Tool();
		int[] n = new int[1];
		tool.inputArray(n);
		long[] a = new long[n[0]];
		tool.inputArray(a);
		long tmp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
					tmp = 0;
				}
			}
		}
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(a[0] + " " + a[a.length - 1] + " " + sum);
	}
}

class Toi17 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		Tool tool = new Tool17();
		int[] hw = new int[1000];
		tool.inputArray(hw);
		for (int h = 0; h < hw.length - 1; h+=2) {
			for (int i = 0; i < hw[h]; i++) {
				for (int j = 1; j <= hw[h+1]; j++) {
					if(hw[h] == 0 && hw[h+1] == 0){
						break;
					}
					System.out.print("#");
				}
				if(hw[h] == 0 && hw[h+1] == 0){
					break;
				}
				System.out.println();
			}
			if(hw[h] == 0 && hw[h+1] == 0){
				break;
			}
			System.out.println();
		}
	}
}

class Toi18 implements Toi {
	public void exec(String[] args) {
		solve();
	}

	public void solve() {
		Tool tool = new Tool17();
		long[] hw = new long[1000];
		tool.inputArray(hw);
		for (int h = 0; h < hw.length - 1; h+=2) {
			if(hw[h] == 0 && hw[h+1] == 0){
				break;
			}
			for(int i = 0;i < hw[h+1];i++){
				System.out.print("#");
			}
			System.out.println();
			for (int i = 0; i < hw[h] - 2; i++) {
				System.out.print("#");
				for (int j = 1; j <= hw[h+1] - 2; j++) {
					System.out.print(".");
				}
				System.out.print("#");
				if(hw[h] == 0 && hw[h+1] == 0){
					break;
				}
				System.out.println();
			}
			if(hw[h] == 0 && hw[h+1] == 0){
				break;
			}
			for(int i = 0;i < hw[h+1];i++){
				System.out.print("#");
			}
			System.out.println();
			System.out.println();
		}
	}
}

class Toi19 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool17();
		int[] hw = new int[1000];
		tool.inputArray(hw);
		for (int h = 0; h < hw.length - 1; h+=2) {
			for (int i = 0; i < hw[h]; i++) {
				for (int j = 1; j <= hw[h+1]; j++) {
					if(hw[h] == 0 && hw[h+1] == 0){
						break;
					}
					if(i % 2 == 0) {
						if (j % 2 != 0) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}else{
						if (j % 2 != 0) {
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
				}
				if(hw[h] == 0 && hw[h+1] == 0){
					break;
				}
				System.out.println();
			}
			if(hw[h] == 0 && hw[h+1] == 0){
				break;
			}
			System.out.println();
		}
	}
}

class Toi20 implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool();
		int[] n = new int[1];
		int x;
		int[] y = new int[4];
		int z = 0;
		int zSum = 0;
		tool.inputArray(n);
		for(int i = 1;i <= n[0];i++){
			x = i;
			if(x % 3 == 0) {
				System.out.print(" " + x);
				continue;
			}else{
				z=0;
				for(int j = 0;j < y.length;j++) {
					y[j]=0;
					if (x % 10 == 3) {
						System.out.print(" " + (int)((x * Math.pow(10,j)) + z));
						break;
					}else {
						z  += (x - ((x / 10) * 10)) * (Math.pow(10,j));
						if ((x /= 10) > 0) {
							y[j]++;
							continue;
						}else {
							z=0;
							break;
						}
					}
				}
			}
		}
		System.out.println();
	}
}

class Toi21 implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool();
		byte[] n = new byte[1];
		tool.inputArray(n);
		short[] a = new short[n[0]];
		tool.inputArray(a);
		short tmp = 0;
		for (byte i = 0;i < a.length/2;i++){
			tmp = a[i];
			a[i] = a[a.length - (1 + i)];
			a[a.length - (1 + i)] = tmp;
		}
		for(byte i = 0;i < a.length - 1;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println(a[a.length-1]);
	}
}
