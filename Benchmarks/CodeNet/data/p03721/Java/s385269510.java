import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		long K=scan.nextInt();

		int[][] ab = new int[N][2];
		for(int i=0;i<N;i++){
			ab[i][0]=scan.nextInt();
			ab[i][1]=scan.nextInt();
		}


		Arrays.sort(ab,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1,int[] o2){
				return o1[0] -o2[0];
			}
		});

		long sum=0;
		int cnt=0;
		long ans;
		while(true){
			sum+=ab[cnt][1];
			if(K<=sum){
				ans = ab[cnt][0];
				break;
			}
			cnt++;
		}
		System.out.println(ans);
	}

}
