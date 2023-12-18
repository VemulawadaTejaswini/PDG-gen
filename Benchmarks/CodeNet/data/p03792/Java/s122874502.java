import java.util.Scanner;
class Main{
	static int N;
static final long PRIME=(long)(1e9+7);
	static long fact(int n){
		long f=1;
		for(int i=1;i<=n;i++)f=(f*i)%PRIME;
		
		return f;
		
		
	}
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			//Input
			N=Integer.parseInt(sc.next());
			String tmp= new String();
			boolean[][] x= new boolean[N][N];
			boolean[] IsBlackExists =new boolean[N];
			boolean[] AllBlack =new boolean[N];
			boolean AllWhite=true;

			for(int i=0;i<N;i++)AllBlack[i]=true;

			for(int i=0;i<N;i++){
				tmp=sc.next();
				for(int j=0;j<N;j++){
					x[i][j]=(tmp.toCharArray()[j]=='#');
					IsBlackExists[j]=IsBlackExists[j]||x[i][j];
					AllBlack[j]=IsBlackExists[j]&&x[i][j];
					
				}
 			}
			for(int i=0;i<N;i++)AllWhite=AllWhite&&!IsBlackExists[i];
			
			//calculate
			int ans=N*N*N;
			
			if(AllWhite)ans=-1;
			
			for(int i=0;i<N;i++){
				int ansi=0;
				for(int j=0;j<N;j++){
					if(!x[i][j]){
						ansi+=IsBlackExists[i]?1:2;
					};
				}
				for(int j=0;j<N;j++)ansi+=AllBlack[j]?0:1;
				ans=Math.min(ans, ansi);
 			}
			
			
			System.out.println(ans);
			
			
			
		}
	}
}
