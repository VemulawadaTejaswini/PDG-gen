import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {

		new AOJ0209();

	}

	class AOJ0209{
		int[][] window;
		int[][] pic,pic2,pic3,pic4,memo;
		int n,m,k;

		boolean search(int num,int x,int y){
			int[][] p = new int[m][m];
			k=num-1;
			if(num==1)p = pic;
			else if(num==2)p = pic2;
			else if(num==3)p = pic3;
			else if(num==4)p = pic4;
			boolean sw = true;
			for(int i=0;i<m;i++)for(int s=0;s<m;s++){
				if(p[i][s]==-1)continue;
				if(p[i][s]!=window[y+i][x+s]){
					sw=false;
					break;
				}
			}
			if(sw)return true;
			return false;
		}

		void doIt(){
			k=-1;
			int x=-1,y=-1;
			boolean sw = false;
			for(int i=0;i<n-m+1;i++){
				for(int s=0;s<n-m+1;s++){
					if(window[i][s]==pic[0][0])sw = search(1, s, i);
					else if(pic[0][0]==-1)sw = search(1, s, i);
					else if(window[i][s]==pic2[0][0])sw = search(2, s, i);
					else if(pic2[0][0]==-1)sw = search(2, s, i);
					else if(window[i][s]==pic3[0][0])sw = search(3, s, i);
					else if(pic3[0][0]==-1)sw = search(3, s, i);
					else if(window[i][s]==pic4[0][0])sw = search(4, s, i);
					else if(pic4[0][0]==-1)sw = search(4, s, i);
					if(sw){
						x = memo[k][0]+i+1;
						y = memo[k][1]+s+1;
						break;
					}
				}
				if(sw)break;
			}
			System.out.println(sw? x+" "+y:"NA");
		}
		
		void setting(){
			int cnt = 0;
			for(int i=m-1;i>=0;i--)for(int s=0;s<m;s++){
				pic2[cnt/m][cnt%m] = pic[s][i];
				cnt++;
			}
			cnt = 0;
			for(int i=m-1;i>=0;i--)for(int s=0;s<m;s++){
				pic3[cnt/m][cnt%m] = pic2[s][i];
				cnt++;
			}
			cnt = 0;
			for(int i=m-1;i>=0;i--)for(int s=0;s<m;s++){
				pic4[cnt/m][cnt%m] = pic3[s][i];
				cnt++;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic[i][s]!=-1){
						memo[0][0]=s;memo[0][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic2[i][s]!=-1){
						memo[1][0]=s;memo[1][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic3[i][s]!=-1){
						memo[2][0]=s;memo[2][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic4[i][s]!=-1){
						memo[3][0]=s;memo[3][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
		}

		public AOJ0209() {
			while(true){
				n = in.nextInt();
				m = in.nextInt();
				if(n==0&&m==0)break;
				window = new int[n][n];
				memo = new int[4][2];
				for(int i=0;i<n;i++)for(int s=0;s<n;s++)window[i][s] = in.nextInt();
				pic = new int[m][m];pic2 = new int[m][m];pic3 = new int[m][m];pic4 = new int[m][m];
				for(int i=0;i<m;i++)for(int s=0;s<m;s++)pic[i][s] = in.nextInt();
				setting();
				doIt();
			}
		}
	}

}