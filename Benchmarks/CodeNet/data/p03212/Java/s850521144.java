import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class Main{
	static boolean check(int x) {
		boolean check3 = false, check5 = false, check7 = false, checkother = false;
		while(x > 0) {
			int keta = x % 10;
			if(keta == 3) check3 = true;
			else if(keta == 5) check5 = true;
			else if(keta == 7) check7 = true;
			else checkother = true;
			x /= 10;
		}
		return (check3 && check5 && check7) && !(checkother);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		/* Generating 753 number */
		TreeSet<Integer> set = new TreeSet<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		st.add(7); st.add(5); st.add(3);
		while(!st.isEmpty()) {
			int now = st.pop();
			if(check(now)) set.add(now);
			if(Integer.toString(now).length() == 9) continue;
			st.push(now * 10 + 3);
			st.push(now * 10 + 5);
			st.push(now * 10 + 7);
		}

		/* Counting 753 number */
		int cnt = 0;
		for(int s : set) {
			if(s <= N) cnt++;
			else break;
		}
		System.out.println(cnt);

	}
}