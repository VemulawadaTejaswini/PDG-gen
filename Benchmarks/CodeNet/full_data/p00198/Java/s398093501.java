import java.util.*;

public class Main {
	int n, cnt;
	int[][] c;
	char[] list = new char[]{'R','Y','B','M','G','C'};
	
	void up(int m){
		int tmp = c[m][0];
		c[m][0] = c[m][1];
		c[m][1] = c[m][5];
		c[m][5] = c[m][4];
		c[m][4] = tmp;
	}
	
	void right(int m){
		int tmp = c[m][1];
		c[m][1] = c[m][3];
		c[m][3] = c[m][4];
		c[m][4] = c[m][2];
		c[m][2] = tmp;
	}
	
	boolean check(int m){
		for(int i=m-1;i>=0;i--){
			int cc = 0;
			for(int j=0;j<6;j++) if(c[i][j]==c[m][j]) cc++;
			if(cc==6) return true;
		}
		return false;
	}
	
	void func(int m){
		for(int i=0;i<6;i++){
			if(i==4) right(m);
			if(i>=4) up(m);
			for(int j=0;j<4;j++){
				if(check(m)) return;
				right(m);
			}
			if(i!=5) up(m);
		}
		cnt++;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			c = new int[n][6];
			cnt = 1;
			for(int i=0;i<n;i++){
				for(int j=0;j<6;j++){
					char a = sc.next().charAt(0);
					for(int k=0;k<6;k++){
						if(a==list[k]){
							c[i][j] = k;
							break;
						}
					}
				}
				if(i!=0) func(i);
			}
			System.out.println(n-cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}