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
		int count=0;
		int sum=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				drinkArray[i][j]=sc.nextInt();
			}
		}
		
		Arrays.sort(drinkArray,(tenpo1,tenpo2)->Integer.compare(tenpo1[0],tenpo2[0]));
		
		for(int i=0;count<M;i++) {
			for(int j=1;j<=drinkArray[i][1];j++){
				if(count<M) {
					count++;
					sum+=drinkArray[i][0];
				}else{
					break;
				}
			}
		}
		
		System.out.println(sum);
	}
 
}