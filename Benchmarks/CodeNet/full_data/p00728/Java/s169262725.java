import java.utill.*;

public class Main(){
	Scanner sc;
	static void solve(){
		sc=new Scanner(System.in);
		while(sc.hasNext()){
			int score[]=new int[sc.nextInt()];
			float sum=0;

			for(int i=0; i<score.length; i++)
				score[i]=sc.nextInt();
			for(int i=1; i<score.length-1; i++)
				sum+=score[i];
			sum/=score.length-2;
			System.out.println((int)sum);
		}
		sc.close;
	}
}