import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int N=sc.nextInt();
		sc.nextLine();		
		final String[][] S =new String[N][N];
		for(int i=0;i<N;i++){
			S[i]=sc.nextLine().split("");
		}
		int cnt=0;		
		for(int a=0;a<N;a++){
			for(int b=0;b<N;b++){
				String[][] S2=new String[N][N]; 
				boolean f=false;
				for(int i=0;i<N;i++){
					for(int j=0;j<N;j++){
						S2[i][j]=S[(a+i)%N][(b+j)%N];
					//	System.out.print(S2[i][j]);
					}
				}
				for(int i=0;i<N;i++){
					for(int j=0;j<N;j++){
						if(! S2[i][j].equals(S2[j][i])){
							f=true;
							break;
						}
					}
					if(f)break;
				}
				if(! f)cnt=cnt+1;
			}
		}
		
		System.out.println(cnt);
	}
}
