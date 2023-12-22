import java.util.Scanner;

public class Main {

	static char[][]field;
	static char[]a={'o','x'};
	static int[]v1={-1,0,1,-1,1,-1,0,1};
	static int[]v2={-1,-1,-1,0,0,1,1,1};
	static int  turn;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		field=new char[8][];
		turn=0;
		for(int i=0;i<8;i++){
			field[i]=sc.next().toCharArray();
		}
		int pass=0;
		for(;;){
			
			int x=0,y=0,max=0;
			if(turn==0){
				max=0;
			}
			else{
				max=1;
			}
			boolean isPass=true;;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					int[] put =putCount(i,j,a[turn]);

					if(put==null)continue;
					if(turn==0){
						if(max<put[0]){
							max=put[0];
							x=i;
							y=j;
							isPass=false;
						}						
					}
					else{
						if(max<=put[0]){
							max=put[0];
							x=i;
							y=j;
							isPass=false;
						}
					}

				}
			}
			if(!isPass){
				put(x,y,a[turn]);
				pass=0;
			}
			else{
				pass++;
				if(pass==2){
					break;
				}
			}
			turn=1-turn;

			
			int cnt=0;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(field[i][j]!='.')cnt++;
				}
			}
			if(cnt==64)break;
//			System.out.println(pass);
//			System.out.println(isPass);
//			output();
		}
		
		output();
	}
	static void output(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(field[i][j]);
			}
			System.out.println();
		}		
	}
	static void put(int x,int y,char c){
		field[x][y]=(char)c;
		for(int i=0;i<v1.length;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(xx<0||yy<0||xx>=8||yy>=8)continue;
			if(field[xx][yy]==a[1-turn]){
				int u=uraCount(xx,yy,c,i);
				if(u!=-1){
					ura(xx,yy,c,i,u);
				}
			}
		}
	}
	static void ura(int x,int y,int c,int dir,int count){
		for(int i=0;i<count;i++){
			field[x][y]=(char)c;
			x+=v1[dir];
			y+=v2[dir];
		}
	}
	static int[] putCount(int x,int y,char c){
		
		// テ・ツ?凝ヲツ閉ーテ」ツ??ヲツ鳴ケテ・ツ青?
		int[] re={0,0};
		if(field[x][y]!='.')return null;
		for(int i=0;i<v1.length;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(xx<0||yy<0||xx>=8||yy>=8)continue;
			if(field[xx][yy]==a[1-turn]){
				int u=uraCount(xx,yy,c,i);
				if(u!=-1){
//					System.out.println(u);
					re[0]+=u;
				}
			}
		}
		return re;
	}
	static int uraCount(int x,int y,int c,int dir){
		int re=1;
		for(;;){
			x+=v1[dir];
			y+=v2[dir];
			if(x<0||y<0||x>=8||y>=8)break;
			if(field[x][y]==c){
				return re;
			}
			else if(field[x][y]==a[1-turn]){
				re++;
			}
			else{
				break;
			}
		}
		return -1;
	}
	
}