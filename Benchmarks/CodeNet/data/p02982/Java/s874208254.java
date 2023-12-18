
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int dimension = sc.nextInt();
		int[][] X = new int[number][dimension];
		int cnt = 0;
		//データを配列に格納
		for(int i =0; i<number ;i++) {
			for(int j =0; j<dimension;j++) {
				X[i][j] = sc.nextInt();			
			}		
		}
		for(int i =0; i<number ;i++) {
			for(int j =i+1; j<number;j++) {
              		int distance =0;
				 for(int k =0;k<dimension;k++)	{
					 int work =Math.abs(X[i][k]-X[j][k]);
					 distance +=work*work;
				 }
				 boolean flag =false;
				 for(int k = 0;k<=distance ;k++) {
					 if(k*k == distance) {
						 //System.out.println(i);
						 //System.out.println(j);
                       flag =true;
					 }
				 }
				 if(flag== true) {
					++cnt;
				 }
			}		
		}
		System.out.println(cnt);

	}

}
