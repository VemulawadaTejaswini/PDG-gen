import java.util.Scanner;

class Solve{
	public int plus[];
	public int ans[];
	public void printans(int a,int b,int i) { 
		if(b == 0) System.out.printf("yes\n");
		else if(a + 1 != plus.length) {
			printans(a + 1,b - plus[a],i);
			printans(a + 1,b,i);
		}
		else if(b == ans[i]) System.out.printf("no\n");
	}
}

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		Solve sv = new Solve();
		//prepare facts
		int num = sc.nextInt();
		sv.plus = new int[num];
		for(int i = 0;i < num;i++) {
			sv.plus[i] = sc.nextInt();
		}
		//prepare answers
		int ansnum = sc.nextInt();
		sv.ans = new int[ansnum];
		for(int i = 0;i < ansnum;i++) {
			sv.ans[i] = sc.nextInt();
		}
		//print yes or no
		for(int i = 0;i < ansnum;i++) {
			sv.printans(0,sv.ans[i],i);
		}
		sc.close();
	}
}
