import java.util.Scanner;

public class Main{
	static BinaryOperator add = new BinaryOperator(){
		@Override
		public int apply(int left, int right){ return left + right;}
		public String toString() { return "+";}
	};
	
	static BinaryOperator subtract = new BinaryOperator(){
		@Override
		public int apply(int left, int right){ return left - right;}
		public String toString() { return "-";}
	};
	
	static BinaryOperator multiply = new BinaryOperator(){
		@Override
		public int apply(int left, int right){ return left * right;}
		public String toString() { return "*";}
	};

	static int[][] permutation4 = new int[24][4];
	static BinaryOperator[] operation = new BinaryOperator[] {add, subtract, multiply};
	static BinaryOperator[][] permutation3 = new BinaryOperator[27][3];
	
	static {
		int n = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) continue;
				for(int k = 0; k < 4; k++) {
					if(i == k || j == k) continue;
					permutation4[n++] = new int[] {i, j, k, 6-i-j-k};
				}
			}
		}
		
		n = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					permutation3[n++] = new BinaryOperator[] {operation[i], operation[j], operation[k]};
				}
			}
		}
	}
	
	static FourExpression solve(int i1, int i2, int i3, int i4) {
		int[] in = new int[] {i1, i2, i3, i4};
		boolean[] bra = new boolean[] {false, true};
		for(int[] perm: permutation4) {
			for(BinaryOperator[] bp: permutation3) {
				for(boolean b: bra) {
					FourExpression result = new FourExpression(in[perm[0]], in[perm[1]], in[perm[2]], in[perm[3]], bp[0], bp[1], bp[2], b);
					if(result.calc() == 10) return result;
				}
			}
		}
		return null;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int arr[] = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
			
			FourExpression out = solve(arr[0], arr[1], arr[2], arr[3]);
			if(out != null)System.out.println(out);
			else System.out.println(0);
		}
		sc.close();
	}
	
}

interface BinaryOperator{
	int apply(int left, int right);
	String toString();
}

class FourExpression{
	
	int i1, i2, i3, i4;
	BinaryOperator o1, o2, o3;
	boolean bracket;
	
	public FourExpression(int i1, int i2, int i3, int i4, BinaryOperator o1, BinaryOperator o2, BinaryOperator o3, boolean bracket){
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
		this.i4 = i4;
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
		this.bracket = bracket;
	}
	
	int calc(){
		return bracket? o2.apply(o1.apply(i1, i2), o3.apply(i3, i4)): o3.apply(o2.apply(o1.apply(i1, i2), i3), i4);
	}
	
	public String toString() {
		return bracket? "(" + i1 + o1.toString() + i2 +")" + o2.toString() + "(" + i3 + o3.toString() + i4 + ")":
				"((" + i1 + o1.toString() + i2 + ")" + o2.toString() + i3 + ")" + o3.toString() + i4;
	}
}