
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		int[] A = new int[N];

		for(int i=0;i<N;i++){
			A[i]=scan.nextInt();
		}

		int pm = 0;
		int bef = A[0];

		int num = 1;


		for(int i=1;i<N;i++){
			if(pm==0){
				pm = (A[i]-bef);
				bef = A[i];
				continue;
			}else{
				int temp = (A[i]-bef)*pm;
				if(temp>0){
				}else if(temp<0){
					num++;
					pm = 0;
				}
				bef = A[i];
			}

		}

		System.out.println(num);



	}

}
