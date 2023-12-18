import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[][] map = new boolean[N][N];
		for(int i=0;i<M;++i){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			map[a][b] = true;
			map[b][a] = true;
		}
		
		ArrayList<Integer> taka = new ArrayList<Integer>();
		taka.add(0);
		for(int i=0;i<N;++i){
			boolean add = true;
			for(int j=0;j<taka.size();++j){
				if(!map[i][taka.get(j)]){
					add = false;
					break;
				}
			}
			if(add) taka.add(i);
		}
		if(taka.size()==N){
			System.out.println((N*(N-1)/2));
			return;
		}

		ArrayList<Integer> hasi = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			if(!taka.contains(i)) hasi.add(i);
		}
		boolean valid = true;
		for(int i=0;i<hasi.size();++i){
			for(int j=i+1;j<hasi.size();++j){
				if(!map[hasi.get(i)][hasi.get(j)]){
					valid = false;
					break;
				}
			}
			if(!valid) break;
		}
		if(!valid){
			System.out.println(-1);
			return;
		}

		int takahasies = 0;
		for(int i=0;i<taka.size();++i){
			boolean add = true;
			for(int j=0;j<hasi.size();++j){
				if(!map[taka.get(i)][hasi.get(j)]){
					add = false;
					break;
				}
			}
			if(add){
				taka.remove(i);
				takahasies++;
			}
		}

		int takas = taka.size();
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<=takahasies;++i){
			int a = takas+i;
			int b = N-a;
			int temp = (a*(a-1)+b*(b-1))/2;
			if(temp<ans) ans = temp;
		}
		System.out.println(ans);
		return;
	}
}