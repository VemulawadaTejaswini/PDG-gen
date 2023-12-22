import java.util.*;


public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().doit();

	}

	private void doit() {
		new D();
	}

	class D{

		class C implements Comparable<C>{
			int s,e,cost;

			public C(int s, int e, int cost) {
				this.s = s;
				this.e = e;
				this.cost = cost;
			}

			@Override
			public int compareTo(C o) {
				if(this.e < o.e) return -1;
				if(this.e < o.e) return 1;
				if(this.s < o.s) return -1;
				if(this.s > o.s) return 1;
				return 0;
			}

			@Override
			public String toString() {
				return "C [s=" + s + ", e=" + e + ", cost=" + cost + "]";
			}

		}
		D(){
			while(true){
				int n = sc.nextInt();
				if(n == 0 ) break;
				int [] mlist = new int[n];
				int [] llist = new int[n];
				ArrayList<ArrayList<Integer>> slist = new ArrayList<ArrayList<Integer>>();
				ArrayList<ArrayList<Integer>> elist = new ArrayList<ArrayList<Integer>>();
				int maxM = 0;
				for(int i = 0 ; i < n; i++){
					mlist[i]  = sc.nextInt();
					llist[i] = sc.nextInt();
					maxM = Math.max(maxM, mlist[i]);
					slist.add( new ArrayList<Integer>());
					elist.add(new ArrayList<Integer>());
					for(int j = 0 ; j < mlist[i]; j++){
						int s = sc.nextInt();
						int e = sc.nextInt();
						slist.get(i).add(s);
						elist.get(i).add(e);

					}
				}

				ArrayList<ArrayList<C>> data = new ArrayList<ArrayList<C>>();
				for(int i =0 ; i < maxM; i++){
					data.add(new ArrayList<Main.D.C>());
				}
				
				long [] offset = new long[maxM];
				
				for(int i = 0; i < n; i++){
					for(int j = 0 ; j <maxM; j++){
						if(j >= slist.get(i).size()){
							offset[j] += llist[i];
							continue;
						}
						int nows = slist.get(i).get(j);
						int nowe = elist.get(i).get(j);
						data.get(j).add(new C(nows, nowe, llist[i]));
					}
				}
				
				for(int i = 0 ; i < data.size(); i++){
					Collections.sort(data.get(i));
				}

				long [][] dp = new long[maxM][23];
				for(int i = 0 ; i < maxM; i++){
					for(int j = 0; j < data.get(i).size(); j++){
						C nowC = data.get(i).get(j);
						for(int k = nowC.e; k <= 22; k++){
							long v = dp[i][nowC.s] + nowC.cost;
							dp[i][k] = Math.max(dp[i][nowC.e], v);
						}
					}
				}

				long ans = Long.MAX_VALUE;
				for(int i = 0 ; i < maxM; i++){
					ans = Math.min(ans, dp[i][22] + offset[i]	);
				}
				System.out.println(ans);
			}
		}
	}

	class A{
		A(){
			while(true){
				int n = sc.nextInt();
				int q = sc.nextInt();
				if((n | q ) == 0) break;
				String name [] = new String[n];
				int [] s = new int[n];
				int [] e = new int[n];
				for(int i = 0 ; i < n; i++){
					name[i] = sc.next();
					int span = sc.nextInt();
					e[i] = sc.nextInt();
					int start = e[i] - span + 1;
					s[i] = start;
				}

				while(q-- > 0){
					int input = sc.nextInt();
					boolean ansflg = false, dupflg = false;
					int ind = -1, ans = 0;
					for(int i = 0 ; i < n; i++){
						if(isB(input, s[i], e[i])){
							ansflg = true;
							if(dupflg){
								ansflg = false;
								break;
							}

							ind = i;
							ans = input - s[i] + 1;

							dupflg = true;
						}else{

						}
					}
					if(ansflg){
						System.out.println(name[ind] + " " + ans);
					}
					else{
						System.out.println("Unknown");
					}
				}
			}
		}

		private boolean isB(int input, int s, int e) {
			if(s <= input && input <= e){
				return true;
			}
			return false;
		}
	}
}