import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	int [][] data;
	int [] table;
	LinkedList<Integer> mat;
	
	private void doit(){
		data = new int[100][2];
		init();
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(data[n][1] - data[n][0]);
		}
	}

	private void init() {
		table = new int[17];
		Arrays.fill(table, -1);
		mat = new LinkedList<Integer>();
		for(int i = 0;; i++){
			if(i != 0 && isOK()) break;
			out(i);
			if(i % 5 == 0 && i / 5  < 100){
				data[i / 5][0] = i;
				mat.addLast(i / 5);
			}
			while(in(i)){
			}
		}
		
	}

	private boolean in(int time) {
		if(mat.isEmpty()) return false;
		int nextid = mat.getFirst();
		int num = 0;
		if(nextid % 5 == 1){
			num = 5;
		}
		else{
			num = 2;
		}
		for(int i = 0; i < table.length; i++){
			if(table[i] != -1) continue;
			int now = 1;
			for(int j = i + 1; j < table.length; j++){
				if(table[j] == -1){
					now++;
					if(now == num){
						for(int k = 0; k < num; k++){
							table[i + k] = nextid;
						}
						data[nextid][1] = time;
						mat.removeFirst();
						return true;
					}
				}
				else{
					break;
				}
			}
		}
		return false;
	}

	private void out(int time) {
		for(int i = 0; i < table.length; i++){
			if(table[i] >= 0){
				int id = table[i];
				int res = data[id][0] + 17 * (id % 2) + 3 * (id % 3) + 19;
				if(res == time){
					table[i] = -1;
				}
			}
		}
	}

	private boolean isOK() {
		for(int i = 0; i < table.length; i++){
			if(table[i] != -1){
				return false;
			}
		}
		return true;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}