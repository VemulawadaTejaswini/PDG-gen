import java.util.Scanner;

class Solve{
	public int plus[];
	public int ans[];
	public int count;
	public void printans(int a,int b,int i) { 
		if(b == 0) ;
		//If computer finds answer, stop.
		else {
			count++;
			if(a < plus.length) {
				printans(a + 1,b - plus[a],i);
				printans(a + 1,b,i);
			}
		}
	}
}

class Sample{
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
			sv.count = 0;
			sv.printans(0,sv.ans[i],i);
			if(sv.count == Math.pow(2,sv.plus.length + 1) - 1) System.out.printf("no\n");
			else System.out.printf("yes");
		}
		sc.close();
	}
}
