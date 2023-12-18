import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("3\n1 1 2");
		// 整数の入力
		int n = sc.nextInt();
		//int s = 0;
		int end =  0;
		int na[] = new int[n];
		int a, b, c;
		ArrayList<Integer> ans_nar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{
			ans_nar.add(sc.nextInt());
		}
		//System.out.println(ans_nar);
		ArrayList<Integer> nar = new ArrayList<Integer>();
		Nar narn = new Nar(nar, ans_nar, n, 0);
		ArrayList<Integer> result;
		result = narn.cac();
		//System.out.println(result);
		if(result.get(0)==-1) {
			System.out.println(-1);
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				System.out.println(result.get(n-i));
			}
		}
	}

}



class Nar {
	public ArrayList<Integer> nar;
	public ArrayList<Integer> ans_nar;
	public int n;
	public int i;
	Nar(ArrayList<Integer> naro, ArrayList<Integer> ans_naro, int no, int io){
		nar = (ArrayList<Integer>) naro.clone();
		ans_nar = (ArrayList<Integer>) ans_naro.clone();
		n = no;
		i = io;
		//System.out.println(nar);
	}
	public ArrayList<Integer> cac(){
		if(n==i) {
			ArrayList<Integer> ans = new ArrayList<Integer>();
			if(nar.equals(ans_nar)) {
				ans.add(1);
				return ans;
			}
			else {
				ans.add(-1);
				return ans;
			}
		}
		else {
			for (int p=0; p <= i; p++) {
				ArrayList<Integer> narc = (ArrayList<Integer>) nar.clone();
				narc.add(p, p+1);
				Nar narn = new Nar(narc, ans_nar, n, i+1);
				ArrayList<Integer> ans = new ArrayList<Integer>();
				ans = narn.cac();
				if(ans.get(0) != -1) {
					ans.add(p+1);
					return ans;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(-1);
		return ans;
	}

}