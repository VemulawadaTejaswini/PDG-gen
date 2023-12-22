import java.util.*;

public class Main{
	public static int di[] = {1,1,1,0};
	public static int dj[] = {0,-1,1,1};

	public static int dfs(ArrayList<Integer> list){
		if(list.size() == 0) return 0;
		int min = list.size();
		int ni,nj,isize,jsize,rst;

		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				isize = (list.size()-1) / 4;
				jsize = list.size()-i*4>4 ? 3 : (list.size()-1)%4;
				if(i<0 || i>isize || j<0 || j>jsize) continue; 

				for(int k=0;k<4;k++){
					ni = i + di[k];
					nj = j + dj[k];
					jsize = list.size()-ni*4>4 ? 3 : (list.size()-1)%4;

					if(ni<0 || ni>isize || nj<0 || nj>jsize) continue;
					if(list.get(ni*4+nj)==list.get(i*4+j)){
						ArrayList<Integer> tmp = new ArrayList<Integer>(list);
						tmp.remove(ni*4+nj);
						tmp.remove(i*4+j);
						rst = dfs(tmp);
						if(rst == 0) return 0;
						if(min > rst) min = rst;
					}
				}
			}
		}
		return min;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<20;i++) list.add(sc.nextInt());
			System.out.println(dfs(list));
		}
	}
}