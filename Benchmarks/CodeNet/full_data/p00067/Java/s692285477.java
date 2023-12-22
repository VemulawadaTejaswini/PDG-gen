import java.util.*;
//文字操作
class Main {
	Scanner sc = new Scanner(System.in);

	public void lmap(int i,int j){
		map[i][j]='0';
		if(i-1>=0 && map[i-1][j]=='1'){
			lmap(i-1,j);
		}
		if(i+1<12 &&map[i+1][j]=='1'){
			lmap(i+1,j);
		}
		if(j>=1 && map[i][j-1]=='1'){
			lmap(i-1,j-1);
		}
		if(j+1<12 && map[i][j+1]=='1'){
			lmap(i,j+1);
		}
	}
	char[][] map;
	public void run() {
		while(sc.hasNext()){
			map=new char[12][12];
			for(int i=0;i<12;i++){
				map[i]=sc.next().toCharArray();
			}
			int count=0;
			for(int i=0;i<12;i++)
				for(int j=0;j<12;j++){
					if(map[i][j]=='1'){
						count++;
						lmap(i, j);
					}
				}
			ln(count);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}