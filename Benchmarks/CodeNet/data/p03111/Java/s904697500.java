import java.util.Scanner;

public class Main{
	static boolean unsat(String str) {
		boolean check1 = false, check2 = false, check3 = false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '3') check3 = true;
			else if(str.charAt(i) == '1') check1 = true;
			else if(str.charAt(i) == '2') check2 = true;
		}
		return !(check3 && check1 && check2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		int[] l = new int[N];
		for(int i = 0; i < N; i++) l[i] = sc.nextInt();

		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < (1 << (2 * N)); i++) {
			String set = Integer.toString(i, 4);
			while(set.length() < N) set = "0" + set;
			if(unsat(set)) continue;
			int tmp = 0, tmpA = 0, tmpB = 0, tmpC = 0;
			for(int j = 0; j < set.length(); j++) {
				if(set.charAt(j) == '1') {
					if(tmpA != 0) tmp += 10;
					tmpA += l[j];
				}
				else if(set.charAt(j) == '2') {
					if(tmpB != 0) tmp += 10;
					tmpB += l[j];
				}
				else if(set.charAt(j) == '3'){
					if(tmpC != 0) tmp += 10;
					tmpC += l[j];
				}
			}
			tmp += Math.abs(tmpA - A) + Math.abs(tmpB - B) + Math.abs(tmpC - C);
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);
	}
}