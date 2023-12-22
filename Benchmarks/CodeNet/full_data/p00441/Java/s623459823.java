import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int[][] pascal;
	static int n;
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = sc.nextInt();
		pascal = new int[n][n];
		for(int i=0;i<n;i++) {
			pascal[i][0] = 1;
			for(int j=1;j<i;j++) {
				pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
			}
			pascal[i][i] = 1;
			//System.out.println(Arrays.toString(pascal[i]));
		}
		//System.out.println(Arrays.toString(pascal[n-1]));
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			a.add(i);
		}
		System.out.println(re(a,0));
	}
	private static String re(ArrayList<Integer> a,int sum2) {
		//System.out.println(a+","+sum2);
		if(sum2>=sum) {
			return "";
		}
		for(int i=0;i<a.size();i++) {
			ArrayList<Integer> b = (ArrayList<Integer>) a.clone();
			b.remove(i);
			int sum3 = sum2 + pascal[n-1][b.size()] * a.get(i);
			//System.out.println(pascal[n-1][b.size()]);
			if(b.isEmpty()) {
				if(sum3==sum) {
					return String.valueOf(a.get(i));
				}
			}else{
				String c = re(b,sum3);
				if (!c.equals("")) {
					return a.get(i) + " " + c;
				}
			}
		}
		return "";
	}
}