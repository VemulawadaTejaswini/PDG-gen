import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			if(N==0)break;
			Ans[] ans=new Ans[N];
			int[][] score=new int[N][11];
			
			for(int i=0;i<N;i++){
				score[i][0]=cin.nextInt();
				int first=0;
				int[] strike=new int[11];
				int[] spare=new int[11];
				for(int frame=1;frame<=10;){
//					System.out.println(frame+" "+first+" "+score[i][frame-1]);
					if(first==2&&strike[10]==0){
						break;
					}
					if(first==3)break;
					int p=cin.nextInt();

					// strike spare
					for(int j=1;j<10;j++){
						if(strike[j]==1||strike[j]==2){
							score[i][j]+=p;
							strike[j]++;
						}
						else if(spare[j]==1){
							score[i][j]+=p;
							spare[j]++;
						}
					}
					
					// frame==10
					if(frame==10){
						score[i][frame]+=p;
						if(score[i][frame]>=10&&first<=1){
							strike[frame]++;
						}
						first++;
						continue;
					}
					
					if(p==10){
						score[i][frame]+=p;
						strike[frame]++;
						frame++;
						continue;
					}
					
					if(first==0){
						first++;
						score[i][frame]+=p;
						
					}
					else{
						score[i][frame]+=p;
						if(score[i][frame]==10){
							spare[frame]++;
						}
						first=0;
						frame++;
					}
				}
				int sum=0;
				for(int j=1;j<=10;j++){
//					System.out.println(score[i][j]);
					sum+=score[i][j];
				}
				ans[i]=new Ans(score[i][0],sum);
//				System.out.println(score[i][0]+" "+sum);
			}
			Arrays.sort(ans);
			for(int i=0;i<N;i++){
				System.out.println(ans[i].name+" "+ans[i].score);
			}
		}
	}
	static class Ans implements Comparable<Ans>{
		int name;
		int score;
		Ans(int a,int b){
			name=a;
			score=b;
		}
		
		public int compareTo(Ans o) {
			if(this.score==o.score)
				return name-o.name;
			return -(this.score-o.score);
		}
		
	}
}