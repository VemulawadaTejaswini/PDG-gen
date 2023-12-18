import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	BigInteger[][] base = new BigInteger[2][2];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		helper(n);
	}

	private static void helper(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3500;i++){
			for(int j=1;j<=3500;j++){
				for(int k=1;k<=3500;k++){
					long up=i*j+j*k+k*i;
					long down=i*j*k;
					long n1=4*down;
					long n2=n*up;
					if(n1==n2){
						System.out.println(""+i+" "+j+" "+k);
						return;
					}
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
