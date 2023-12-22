import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<TreeSet<Integer>> data = new ArrayList<TreeSet<Integer>>();
			for(int i=0; i < n; i++){
				data.add(new TreeSet<Integer>());
				int m = sc.nextInt();
				for(int j=0; j < m; j++){
					data.get(i).add(sc.nextInt());
				}
			}
			int m = sc.nextInt();
			TreeSet<Integer> klist = new TreeSet<Integer>();
			for(int i=0; i < m; i++){
				klist.add(sc.nextInt());
			}
			int ind = -1;
			for(int i=0; i < n; i++){
				boolean flg = true;
				for(int result: klist){
					if(! data.get(i).contains(result)){
						flg = false;
					}
				}
				if(flg){
					if(ind == -1){
						ind = i+1;
					}
					else{
						ind = -1;
						break;
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