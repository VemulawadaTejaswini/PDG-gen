import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	double allCount = 0;
	double ansCount = 0;
	int[] dx = {-1,0,0,1};
	int[] dy = {0,-1,1,0};
	int s;
	int t;
	int b;
	int n;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = Integer.parseInt(scan.nextLine());
			if(n == 0){
				break;
			}
			allCount = 0;
			ansCount = 0;
			char[] ch = scan.nextLine().replaceAll(" ","").toCharArray();
			s = (ch[0] - 'A');
			t = ch[1] - 'A';
			b = ch[2] - 'A';
			dfs(s/3,s%3,0);
			System.out.printf("%.6f\n",ansCount / allCount);
		}
	}
	public void dfs(int y,int x,int count){
		if(count == n){
			allCount++;
			if(x == t % 3 && y == t/3){
				ansCount++;
			}
			return;
		}
		for(int i = 0;i < 4;i++){
			if(x+dx[i] >= 0 && x+dx[i] < 3 && y+dy[i] >= 0 && y+dy[i] < 3){
				if(x+dx[i] == b % 3 && y+dy[i] == b / 3){
					dfs(y,x,count+1);
				}else{
					dfs(y+dy[i],x+dx[i],count+1);
				}
			}else{
				dfs(y,x,count+1);
			}
		}
	}
}