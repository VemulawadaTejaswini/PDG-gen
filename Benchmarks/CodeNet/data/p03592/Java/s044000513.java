import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Simulate flip processes
	//UPD: Don't always need to take max rows

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
		for (int rows = 1; rows<=K/M;rows++) {
			tempK=K;
			tempK-=M*rows;
			int rowsleft = N-rows;
			int factor = rowsleft-rows;
			if (factor>0&&tempK%factor!=0) ans="No";
			else if (factor<=0&&tempK!=0) ans="No";
			else ans="Yes";
			if (ans.equals("Yes")) break;
		}
		if (ans.equals("No")||ans.equals("")) {
			M=tempN; //Flipping dimensions
			N=tempM;
			tempK=K;
			for (int rows = 1; rows<=K/M;rows++) {
				tempK=K;
				tempK-=M*rows;
				int rowsleft = N-rows;
				int factor = rowsleft-rows;
				if (factor>0&&tempK%factor!=0) ans="No";
				else if (factor<=0&&tempK!=0) ans="No";
				else ans="Yes";
				if (ans.equals("Yes")) break;
			}
		}
		if (ans.equals("")) ans="No";
		System.out.println(ans);
	}	
}