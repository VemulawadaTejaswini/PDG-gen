import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		int d=cin.nextInt();
		int min=1<<30;
		int[][] pos=new int[4][2];
		for(int w=1;w<=n;w++){
			int x,y;
			x=y=0;
			int cnt=0;
			while(true){
				x = (x+1)%w;
				if(x==0)y++;
				if(cnt==a){
					pos[0][0]=x;
					pos[0][1]=y;
				}
				if(cnt==b){
					pos[1][0]=x;
					pos[1][1]=y;
				}
				if(cnt==c){
					pos[2][0]=x;
					pos[2][1]=y;
				}
				if(cnt==d){
					pos[3][0]=x;
					pos[3][1]=y;
				}
			
				
				cnt++;
				if(cnt==n*n)break;
			}
			int d1=Math.abs(pos[0][0]-pos[1][0])+Math.abs(pos[0][1]-pos[1][1]);
			int d2=Math.abs(pos[2][0]-pos[3][0])+Math.abs(pos[2][1]-pos[3][1]);
			min=Math.min(d1+d2,min);
		}
		System.out.println(min);
	}
}