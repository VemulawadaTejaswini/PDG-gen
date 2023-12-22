import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int hako[] = new int[k];
		long ans=1000;//手持ち
		int kabu=0;//株
		
		for(int i=0;i<k;i++) {
			hako[i] = sc.nextInt();
		}
		
		for(int day=0;day<k-1;day++) {
			/*株持ってないとき*/
			if(kabu==0 && hako[day]<hako[day+1]) {
				kabu+=ans/hako[day];
				ans-=hako[day]*(ans/hako[day]);
			}
			/*株持ってる時*/
			else if(kabu!=0 && hako[day]>hako[day+1]){
				/*計算開始*/
				ans+=hako[day]*kabu;
				kabu-=kabu;
				/*終了*/
			}
		}//for
		
		
		ans+=hako[k-1]*kabu;
		System.out.println(ans);
	}
}
