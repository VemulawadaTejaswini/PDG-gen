import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int input1,input2;
		int[] roots = new int[n+1];
		Calc calc = new Calc();

		//1行ずつ読み込み
		for(int i=0;i<m;i++) {
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			sc.nextLine();

			if(roots[input1] == 0) {
				if(calc.searchRoot(roots,input2) != input1)
					roots[input1] = input2;
			}else {
				if(roots[input2] == 0) {
					if(calc.searchRoot(roots,input1) != input2)
						roots[input2] = input1;
				}else {
					int root1 = calc.searchRoot(roots,input1);
					if(root1 != calc.searchRoot(roots,input2)) {
						roots[root1] = input2;
					}
				}
			}
		}
		sc.close();

		int count = 0;
		for(int i=1;i<=n;i++) {
			count += (roots[i] == 0) ? 1:0;
		}
		System.out.println(count);
	}
}



class Calc{
	int searchRoot(int[] roots,int x) {
		if(roots[x]==0)
			return x;
		else
			return searchRoot(roots,roots[x]);
	}
}