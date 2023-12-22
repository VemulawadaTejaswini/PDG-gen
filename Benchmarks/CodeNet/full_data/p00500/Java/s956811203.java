import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] num = new int[N][3];
		int[][] flag = new int[N][3];
		int[] point = new int[N];
		for(int i=0;i<flag.length;i++)Arrays.fill(flag[i], -1);
		Arrays.fill(point, 0);
		for(int i=0;i<N;i++){
			for(int j=0;j<3;j++){
				num[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){		//ラウンド数
			for(int j=0;j<N;j++){
				if(flag[j][i]!=-1)continue;//既にどこかと同じであったらcontinue
				for(int k=0;k<N;k++){//自分自身と同じ数字を全員から探索
					if(num[j][i]==num[k][i]&&j!=k){//もし同じ数字（ただし自分以外)だったらフラグを立てる
						flag[j][i] = 1;
						flag[k][i] = 1;
					}
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<3;j++){
				if(flag[i][j]!=1){
					point[i] += num[i][j];
				}
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(point[i]);
		}
		
	}

}