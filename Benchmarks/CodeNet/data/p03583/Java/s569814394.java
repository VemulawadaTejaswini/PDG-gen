import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	BigInteger[][] base = new BigInteger[2][2];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		helper(n);
	}

	private static void helper(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3500; i++) {
			for (int j = 1; j <= 3500; j++) {

				long up = 4*(long)i * (long)j -(long) j * (long)n - (long)i * (long)n;
				long down = (long)i * (long)j * (long)n;
				if(i==3498&&j==3498){
					System.out.println(up);
					System.out.println(down);
					System.out.println(down/up);
				}
				if (up>0&&down % up==0) {
					System.out.println("" + i + " " + j + " " + down/up);
					return;
				}

			}
		}
	}

	private BigInteger[][] matrixMult(BigInteger[][] leftmatrix, BigInteger[][] rightMatrix) {
		// TODO Auto-generated method stub
		BigInteger[][] res = new BigInteger[2][2];
		res[0][0] = leftmatrix[0][0].multiply(rightMatrix[0][0]).add(leftmatrix[0][1].multiply(rightMatrix[1][0]));
		res[0][1] = leftmatrix[0][0].multiply(rightMatrix[0][1]).add(leftmatrix[0][1].multiply(rightMatrix[1][1]));
		res[1][0] = leftmatrix[1][0].multiply(rightMatrix[0][0]).add(leftmatrix[1][1].multiply(rightMatrix[1][0]));
		res[1][1] = leftmatrix[1][0].multiply(rightMatrix[0][1]).add(leftmatrix[1][1].multiply(rightMatrix[1][1]));
		return res;
	}

	public BigInteger[][] fib(int n) {
		if ((n) <= 1)
			return base;
		BigInteger[][] res = ((n) % 2 == 1 ? fib((n - 1) / 2) : fib(n / 2));
		res = matrixMult(res, res);
		if ((n) % 2 == 1)
			res = matrixMult(res, base);
		return res;
	}

}
