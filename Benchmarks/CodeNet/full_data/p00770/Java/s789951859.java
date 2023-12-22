import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][][] field=new int[1200][1200][2];
	static int SIZE=1200;
	static boolean[] isPrime=new boolean[1000009];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		makeField();
		makePrimeTable();
		for(;;){
			
			int num=sc.nextInt();
			int start=sc.nextInt();
			if(start+num==0)break;
			int x=0,y=0;
			label:for(int i=0;i<SIZE;i++){
				for(int j=0;j<SIZE;j++){
					if(field[i][j][0]==start){
						x=j;
						y=i;
						break label;
					}
				}
			}
			Queue<int[]>q=new LinkedList<int[]>();
			int v=0;
			if(isPrime[field[y][x][0]])v=1;
			q.add(new int[]{y,x,v});
			field[y][x][1]=v;
			while(q.isEmpty()==false){
				int[]a=q.poll();
				y=a[0];x=a[1];
				v=a[2];
//				System.out.println(field[y][x][1]+" "+v);
				if(field[y][x][1]>v)continue;
				y++;
				for(int i=-1;i<=1;i++){
					int xx = x+i;
					if(field[y][xx][0]>num)continue;
					if(isPrime[field[y][xx][0]])v++;
					if(field[y][xx][1]<v){
						field[y][xx][1]=v;
						q.add(new int[]{y,xx,field[y][xx][1]});
					}
					if(isPrime[field[y][xx][0]])v--;
				}
				/*
				// down left
				y++;
				x--;
				System.out.println(field[y][x][0]);
				if(field[y][x][0]<=num&&field[y][x][1]<v){
					field[y][x][1]=v;
					if(isPrime[field[y][x][0]])field[y][x][1]++;
					q.add(new int[]{y,x,field[y][x][1]});
				}
				// down
				x++;
				System.out.println(field[y][x][0]);
				if(field[y][x][0]<=num&&field[y][x][1]<v){
					field[y][x][1]=v;
					if(isPrime[field[y][x][0]])field[y][x][1]++;
					q.add(new int[]{y,x,field[y][x][1]});
				}
				// down right
				x++;
				System.out.println(field[y][x][0]);
				if(field[y][x][0]<=num&&field[y][x][1]<v){
					field[y][x][1]=v;
					if(isPrime[field[y][x][0]])field[y][x][1]++;
					q.add(new int[]{y,x,field[y][x][1]});
				}
				*/
			}
			int max=-1;
			int ans=-1;
			for(int i=0;i<SIZE;i++){
				for(int j=0;j<SIZE;j++){
					if(field[i][j][0]>num)continue;
					if(isPrime[field[i][j][0]]==false)continue;
					if(max<field[i][j][1]){
						max=field[i][j][1];
						ans=field[i][j][0];
					}
					else if(max==field[i][j][1]){
						ans=Math.max(field[i][j][0],ans);
					}
				}
			}
			if(max==-1){
				System.out.println("0 0");
			}
			else
				System.out.println(max+" "+ans);
			for(int i=0;i<SIZE;i++){
				for(int j=0;j<SIZE;j++){
					field[i][j][1]=-2;
				}
			}
		}
	}
	static void makePrimeTable(){
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j=i+i;j<isPrime.length;j+=i)isPrime[j]=false;
			}
		}
	}
	static void makeField(){
		int x = field.length/2;
		int y = field.length/2;
		int num=1;
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				field[i][j][0]=1<<29;
				field[i][j][1]=-2;
			}
		}
		field[x][y][0]=num++;
		for(int n=1;;n+=2){
			if(num>1100000)break;
			// right
			for(int i=0;i<n;i++){
				x++;
				field[y][x][0]=num++;
			}
			// up
			for(int i=0;i<n;i++){
				y--;
				field[y][x][0]=num++;
			}
			// left
			for(int i=0;i<n+1;i++){
				
				x--;
				field[y][x][0]=num++;
			}
			// down
			for(int i=0;i<n+1;i++){
				y++;
				field[y][x][0]=num++;
			}
		}

	}
}