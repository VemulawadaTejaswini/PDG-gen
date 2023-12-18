public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int A = 1;
		int B = 2;
		if(A == B)
			System.out.println("Draw");
		if((A > B && B != 1) || (A == 1 && A != B))
			System.out.println("Alice");
		if((A < B && A != 1) || (B == 1 && A != B))
			System.out.println("Bob");
 
	}

}