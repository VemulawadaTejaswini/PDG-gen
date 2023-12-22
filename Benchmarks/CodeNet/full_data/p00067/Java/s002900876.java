import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}
	
	int filed[][]=new int[12][12];
	void run(){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int count=0;
			
			for(int i=0;i<12;i++){
				char ch[]=sc.next().toCharArray();
				for(int j=0;j<12;j++){
					filed[i][j]=ch[j]-'0';
				}
			}
			
			for(int i=0;i<12;i++){
				for(int j=0;j<12;j++){
					if(filed[i][j]==1){
						count++;
						dfs(j,i,12,12);
					}
				}
			}
			System.out.println(count);
		}
	}
	
    int mx[]={-1,0,1,0};
    int my[]={0,-1,0,1};
	void dfs(int x,int y,int w,int h){
        int i,nx,ny;
        for(i=0;i<4;i++){
            nx=x+mx[i];
            ny=y+my[i];
            if(0<=nx && nx<w && 0<=ny && ny<h && filed[ny][nx]!=0){
                filed[ny][nx]=0;
                dfs(nx,ny,w,h);
            }
        }
    }

}