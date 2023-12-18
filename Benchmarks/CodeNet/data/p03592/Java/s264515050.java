import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Simulate flip processes

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int K = input.nextInt();
		int tempK = K;
		int tempM = M;
		int tempN = N;
		String ans = "";
		//Row first basis
		int numRows = K/M;
		tempK%=M;
		int rowsleft = N-numRows;
		int factor = rowsleft-numRows;
		if (factor!=0&&tempK%factor!=0) ans="No";
		else ans="Yes";
		if (ans.equals("No")) {
			M=tempN; //Flipping dimensions
			N=tempM;
			numRows = K/M;
			tempK%=M;
			rowsleft = N-numRows;
			factor = rowsleft-numRows;
			if (tempK%factor!=0) ans="No";
			else ans="Yes";
		}
		System.out.println(ans);
	}	
}