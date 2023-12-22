import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int score[]=new int[sc.nextInt()];
			if(score.length==0)break;
			float sum=0;

			for(int i=0; i<score.length; i++)
				score[i]=sc.nextInt();
			Arrays.sort(score);
			for(int i=1; i<score.length-1; i++)
				sum+=score[i];
			sum/=score.length-2;
			System.out.println((int)sum);
		}
		sc.close();
	}
}