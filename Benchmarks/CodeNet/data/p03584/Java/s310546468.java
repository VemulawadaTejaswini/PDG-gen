
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean tag = true;

	public static void setOut() throws FileNotFoundException {
		System.setOut(new PrintStream("C:\\Users\\Administrator\\Desktop\\google\\out"));
		File file = new File("C:\\Users\\Administrator\\Desktop\\google\\in");
		InputStream in = new FileInputStream(file);
		sc = new Scanner(in);
	}

	public static void main(String[] args) throws Exception {

		// setOut();
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<int[]> l = new ArrayList<int[]>();
		for (int i = 0; i < n; i++) {
			int[] tmp = { sc.nextInt(), sc.nextInt() };
			l.add(tmp);
		}
		Collections.sort(l, (a, b) -> (b[0] - a[0]));

		helper(l, k);

	}

	private static void helper(List<int[]> l, int k) {
		// TODO Auto-generated method stub
		int res = 0;
		int number = 1 << 30;
		int max=Integer.MIN_VALUE;
		while (number != 0) {
			int tar = k & number;
			if (tar != 0){
				int sum=0;
				for(int i=0;i<l.size();i++){
					if((l.get(i)[0]&number)==0)
						sum+=l.get(i)[1];
				}
				max=Math.max(max, sum);
				number=number>>1;
				continue;
			}
			for(int i=l.size()-1;i>=0;i--){
				if(((l.get(i)[0])&number)!=0){
					l.remove(i);
				}
			}
			number=number>>1;
		}
		for(int i=0;i<l.size();i++)
			res+=l.get(i)[1];
		max=Math.max(max, res);
		System.out.println(max);
	}

}