import java.util.*;

public class Main {
	int [][] data;
	boolean [][] check;
	ArrayList<C> list;
	final int MAX = Integer.MAX_VALUE;
	int p,s;

	class C implements Comparable<C>{
		int x,y,value;

		public C(int x, int y, int value) {
			this.x = x;
			this.y = y;
			this.value = value;
		}

		public int compareTo(C o) {
			if(y < o.y)return -1;
			if(y > o.y)return 1;
			if(x < o.x)return -1;
			if(x > o.x)return 1;
			return 0;
		}
	}//c end

	private void calc(int x, int y){
		boolean flg = false;
		int sum = 0;
		for(int i=0; i < s; i++){
			if(i == x)	continue;
			if(data[y][i] == MAX) break;
			sum += data[y][i];
			if(i == (s - 1)){
				data[y][x] = data[y][s] - sum;
				flg = true;
				list.add(new C(x, y, data[y][x]));
			}
		}
		if(flg) return;
		sum = 0;
		for(int i=0; i < p; i++){
			if(i == y)	continue;
			if(data[i][x] == MAX) break;
			sum += data[i][x];
			if(i == (s - 1)){
				data[y][x] = data[p][x] - sum;
				list.add(new C(x, y, data[y][x]));
			}
		}
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			p = sc.nextInt();
			if(p == 0)
				break;
			s = sc.nextInt();
			data = new int[p + 1][s + 1];
			check = new boolean[p + 1][s + 1];
			list = new ArrayList<C>();

			int count = 0;
			for(int i = 0; i <p + 1; i++){
				for(int j = 0; j < s + 1; j++){
					String temp = sc.next();
					if(temp.equals("?")){
						data[i][j] = MAX;
						count++;
						check[i][j] = false;
					}
					else{
						data[i][j] = Integer.parseInt(temp);
						check[i][j] = true;
					}
				}
			}
			boolean flg = false;
			int count2 = 0;
			while(count2 < count){
				boolean flg2 = false;
				for(int i = 0; i <p; i++){
					for(int j = 0; j < s; j++){
						if(data[i][j] == MAX){
							calc(j,i);
							if(data[i][j] != MAX){
								flg2 = true;
								count2++;
							}
						}
					}
				}
				if(! flg2){
					flg = true;
					break;
				}
			}


			if(! flg){
				for(int i=0; i < p;i++){
					for(int j=0; j < s; j++){
						if(check[i][j] == false){
							System.out.println(data[i][j]);
						}
					}
				}
			}
			else{
				System.out.println("NO");
			}
			System.out.println();

//			Collections.sort(list);
//
//			if(count == list.size()){
//				for(C now: list) System.out.println(now.value);
//			}
//			else{
//				System.out.println("NO");
//			}
//			System.out.println();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();

	}
}