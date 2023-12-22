import java.util.Scanner;

public class Main {
	static char filed[][];
	static int mx[]={-1,0,1,0};
	static int my[]={0,-1,0,1};
	static int w,h,count;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,x=0,y=0;
		char ch[];
		while(true){
			count=0;
			w=sc.nextInt();
			h=sc.nextInt();
			if(w+h==0) break;
			
			filed=new char[h][w];
			ch=new char[w];
			for(i=0;i<h;i++){
				ch=sc.next().toCharArray();
				for(j=0;j<w;j++){
					filed[i][j]=ch[j];
				}
			}
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					if(filed[i][j]=='@'){
						y=i;
						x=j;
					}
				}
			}
			filed[y][x]='#';
			serch(x,y);
			System.out.println(count);
		}
	}
	static void serch(int x,int y){
		int i,nx,ny;
		count++;
		for(i=0;i<4;i++){
			nx=x+mx[i];
			ny=y+my[i];
			if(0<=nx && nx<w && 0<=ny && ny<h && filed[ny][nx]!='#'){
				filed[ny][nx]='#';
				serch(nx,ny);
			}
		}
	}
}