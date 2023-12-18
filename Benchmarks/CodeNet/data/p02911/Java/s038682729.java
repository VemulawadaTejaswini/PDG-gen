import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		Scanner sc=new Scanner(System.in);
		
		//参加者
		int N=sc.nextInt();
		int[] participant=new int[N];
		
		//所持ポイント数
		int K=sc.nextInt();
		int[] point=new int[N];
		
		//正解の回数
		int Q=sc.nextInt();
		int[] correctPerson=new int[Q];
		
		for(int i=0;i<N;i++) {
			participant[i]=i;
			point[i]=K;
		}
		
		for(int i=0;i<Q;i++) {
			correctPerson[i]=sc.nextInt()-1;
		}
		
		for(int i=0;i<Q;i++) {
			for(int j=0;j<N;j++) {
				if(participant[j]!=correctPerson[i]) {
					point[j]=point[j]-1;
				}
			}
		}
		
		
		
		for(int i=0;i<N;i++) {
			if(point[i]>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		
		
		}
		
	}

}
