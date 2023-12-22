import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			ArrayList<Integer> t = new ArrayList<Integer>();
			for(int i=0;i<n;i++) t.add(sc.nextInt());

			int ans = Integer.MAX_VALUE;
			for(int i=1;i<t.size();i++){
				int top = 1;
				int bottom = i<t.size()-1 ? 1 : 0;

				for(int j=i-2;j>=0 && t.get(j) == t.get(j+1);j--,top++);
				for(int j=i+2;j<t.size() && t.get(j) == t.get(j-1);j++,bottom++);

				if(top == 3){
					ans = Math.min(ans,solve(n,t,i,t.get(i-1)));
				}
				if(i+1 < t.size() &&
					 (bottom == 3 && t.get(i-1) != t.get(i+1) ||
						top + bottom >= 3 && t.get(i-1) == t.get(i+1))){
					ans = Math.min(ans,solve(n,t,i,t.get(i+1)));
				}
			}

			System.out.println(ans == Integer.MAX_VALUE ? n : ans);
		}
	}

	private static int solve(int n,ArrayList<Integer> tt,int pos,int col){
		int res = n;
		ArrayList<Integer> t = new ArrayList<Integer>(tt);
		t.set(pos,col);

		while(pos < t.size() && t.get(pos) == col){
			t.remove(pos);
			res--;
		}
		while(--pos >= 0 && t.get(pos) == col){
			t.remove(pos);
			res--;
		}

		while(t.size() >= 4){
			if(pos < 0) break;

			int top = 0;
			int bottom = 0;

			for(int j=pos-1;j>=0 && t.get(j) == t.get(j+1);j--,top++);
			for(int j=pos+1;j<t.size() && t.get(j) == t.get(j-1);j++,bottom++);
			if(top + bottom + 1 < 4) break;

			col = t.get(pos);
			while(pos < t.size() && t.get(pos) == col){
				t.remove(pos);
				res--;
			}
			while(--pos >= 0 && t.get(pos) == col){
				t.remove(pos);
				res--;
			}
		}

		return res;
	}
}