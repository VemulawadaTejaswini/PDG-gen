import java.util.*;
public class Main {
	static int mai,n;
	static int ue[]=new int[201];
	static int sita[]=new int[201];
	static int hade[]=new int[201];
	static int kion[]=new int[201];
	static int m[][] = new int[201][201];
	static int qq[][] = new int[201][201];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		mai = in.nextInt();
		for(int i=1;i<=n;i++)kion[i]=in.nextInt();
		for(int i=0;i<mai;i++){
			sita[i]=in.nextInt();
			ue[i]=in.nextInt();
			hade[i]=in.nextInt();
		}
		for(int i=0;i<200;i++)
			for(int k=1;k<200;k++)m[i][k]=0;//mの初期化
		for(int day=1;day<=n;day++){
			if(day==1){//1日目の初期値
				for(int i=0;i<mai;i++){
					if(kion[day]<sita[i]||kion[day]>ue[i]){
						m[i][day]=-1;
						continue;
					}
				}
				continue;//1日目終わったら2日目へ
			}
			for(int i=0;i<mai;i++){//一枚ずつそれぞれのベストを入力していく
				if(kion[day]<sita[i]||kion[day]>ue[i]){
					m[i][day]=-1;
					continue;
				}
				int max=-1;
				for(int k=0;k<mai;k++){//1日前のベスト
					if(m[k][day-1]==-1)continue;//1日前のmが温度超えてたりしたら無視。
					int wrk=Math.abs(hade[k]-hade[i]);//1日前のk枚目の服との絶対値+m[k][day-1]の最大値を求める。
					if(max<wrk+m[k][day-1]){
						max=wrk+m[k][day-1];
					}
				}
				m[i][day]=max;
			}
		}
		int max=-1;
		for(int i=0;i<mai;i++){
			if(max<m[i][n])max=m[i][n];
		}
		System.out.println(max);
	}
}