import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[][] ten = new int[n][3];//n→人数,0→数学,1→英語,2→国語
			//点数の入力
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++){
					ten[i][j] = sc.nextInt();
				}
			}
			//条件の判定
			for(int i=0;i<n;i++){
				//100点の科目があればAクラス
				if(ten[i][0]==100 | ten[i][1]==100 | ten[i][2]==100){
					System.out.println('A');
				//数学と英語の平均点が90点以上であればAクラス
				}else if((ten[i][0]+ten[i][1])/2 >= 90){
					System.out.println('A');
				}
				//3教科の平均点が80点以上であればAクラス
				else if((ten[i][0]+ten[i][1]+ten[i][2])/3 >= 80){
					System.out.println('A');
				}
				//3教科の平均点が70点以上であればBクラス
				else if((ten[i][0]+ten[i][1]+ten[i][2])/3 >= 70){
					System.out.println('B');
				}
				//3 科目の平均点が50点以上で、数学か英語が80点以上であればBクラス
				else if((ten[i][0]+ten[i][1]+ten[i][2])/3 >= 50 & ten[i][0] >= 80 | ten[i][1] >= 80){
					System.out.println('B');
				}
				//上の条件を満たさない満たさなければCクラス
				else{
					System.out.println('C');
				}
			}
		}
	}
}