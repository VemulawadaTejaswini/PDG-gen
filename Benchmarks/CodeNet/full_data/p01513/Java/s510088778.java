import java.util.*;

public class Main {
	
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			for(int i=0; i < n; i++){
				list.add(new ArrayList<Integer>());
				int m = sc.nextInt();
				for(int j=0; j < m;j++){
					list.get(i).add(sc.nextInt());
				}
				
			}
			int k = sc.nextInt();
			ArrayList<Integer> klist = new ArrayList<Integer>();
			for(int i=0; i < k; i++){
				klist.add(sc.nextInt());
			}
			
			int ind = -1;
			for(int i = 0; i < n; i++){
				boolean flg = false;
				for(int j = 0; j < k; j++){
					int num = klist.get(j);
					if(! list.get(i).contains(num)){
						flg = true;
						break;
					}
				}
				if(! flg){
					if(ind != -1){
						ind = -1;
						break;
					}
					else{
						ind = i + 1;
					}
				}
			}
			System.out.println(ind);
		}
		
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}