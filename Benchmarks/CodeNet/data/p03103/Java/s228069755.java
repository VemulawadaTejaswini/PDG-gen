import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
	
		//栄養ドリンクが売られているお店の数
		int N=sc.nextInt();
		//集めたい栄養ドリンクの個数
		int M=sc.nextInt();
		int[][]drinkArray=new int[N][N];
		int drinkCount=0;
		int keisan;
		int sumMoney=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				drinkArray[i][j]=sc.nextInt();
			}
		}
		
		Arrays.sort(drinkArray,(tenpo1,tenpo2)->Integer.compare(tenpo1[0],tenpo2[0]));
		
		for(int i=0;i<N;i++) {
			int a=M-drinkArray[i][1];
			if(a>0) {
				keisan=drinkArray[i][0]*drinkArray[i][1];
				sumMoney+=keisan;
				M=M-drinkArray[i][1];
			}else {
				if(M>drinkArray[i][1]) {
					keisan=drinkArray[i][0]*drinkArray[i][1];
					sumMoney+=keisan;
					M=M-drinkArray[i][1];
				}else {
					keisan=drinkArray[i][1]-(drinkArray[i][1]-M);
					keisan=drinkArray[i][0]*keisan;
					sumMoney+=keisan;
					M=M-drinkArray[i][1];
				}

			}
		}
	
		
		System.out.println(sumMoney);
	}

}
