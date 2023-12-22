import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		int lines=kb.nextInt();
		int dataNum=kb.nextInt();
		int sum[]=new int[dataNum],
				nowNum[][]=new int[lines][dataNum];
		int totalSum=0;
		int rowSum[]=new int[dataNum];

		for(int i=0;i<lines;i++){
			sum[i]=0;
		}

		for(int i=0;i<lines;i++){
			for(int j=0;j<dataNum;j++){
				nowNum[i][j]=kb.nextInt();
				sum[i]+=nowNum[i][j];
			}
		}
		System.out.println();
		for(int i=0;i<lines;i++){
			for(int j=0;j<dataNum;j++){
				System.out.printf("%d ", nowNum[i][j]);
				rowSum[j]+=nowNum[i][j];

			}
			System.out.printf("%d\n", sum[i]);
		//	totalSum+=sum[i];
		}



		for(int j=0;j<dataNum;j++){
			System.out.printf("%d ",rowSum[j]);
			totalSum+=rowSum[j];
		}
		System.out.printf("%d",totalSum);
		System.out.println();
	}
}