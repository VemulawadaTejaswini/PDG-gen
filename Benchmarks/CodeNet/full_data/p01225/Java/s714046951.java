import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//入力されるカードセット枚数
		int request=sc.nextInt();
		for(int i=0;i<request;i++) {
			//カードの数字を入れる配列作成
			int[] num=new int[9];
			for(int j=0;j<9;j++) {
				num[j]=sc.nextInt();
			}
			//カードの色を入れる配列作成
			String[] color={sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()};
			int Rcount=0;
			int Gcount=0;
			int Bcount=0;
			//Redカード、Greenカード、Blueカードの枚数を調べる
			for(int j=0;j<9;j++) {
				switch(color[j]) {
				case "R":
					Rcount++;
					break;
				case "G":
					Gcount++;
					break;
				case "B":
					Bcount++;
					break;
				}
			}
			//色ごとの配列を作成（color[x]が"R"のときにnum[x]を作成した配列に入れる。GreenとBlueも同様に行う）
			//ArrayList<Integer> Rary=new ArrayList<Integer>();
			int alignedCount=0;//揃っているカードのセット数
			int[] Rary=new int[Rcount];
			int[] Gary=new int[Gcount];
			int[] Bary=new int[Bcount];
			int count=0;//Raryのインデックス番号の指定に必要
			for(int j=0;j<9;j++) {
				if("R".equals(color[j])) {
					Rary[count]=num[j];
					count++;
				}
			}
			Arrays.sort(Rary);
			//赤色のカードが3以上の時の処理
			if(Rcount>=3) {
				for(int j=0;j<Rcount-2;j++) {
					for(int k=j+1;k<Rcount-1;k++) {
						for(int l=k+1;l<Rcount;l++) {
							//連番または数が同一であり、3っつの整数の乗算が0でないときの処理
							if(((Rary[j]==Rary[k]-1 && Rary[j]==Rary[l]-2) || (Rary[j]==Rary[k] && Rary[j]==Rary[l])) && Rary[j]*Rary[k]*Rary[l]!=0) {
								alignedCount++;
								//上記の条件に一致したものを0とし、事実上除外する
								Rary[j]=0;
								Rary[k]=0;
								Rary[l]=0;
							}
						}
					}
				}
			}
			count=0;
			for(int j=0;j<9;j++) {
				if("G".equals(color[j])) {
					Gary[count]=num[j];
					count++;
				}
			}
			Arrays.sort(Gary);
			if(Gcount>=3) {
				for(int j=0;j<Gcount-2;j++) {
					for(int k=j+1;k<Gcount-1;k++) {
						for(int l=k+1;l<Gcount;l++) {
							if(((Gary[j]==Gary[k]-1 && Gary[j]==Gary[l]-2) || (Gary[j]==Gary[k] && Gary[j]==Gary[l])) && Gary[j]*Gary[k]*Gary[l]!=0) {
								alignedCount++;
								Gary[j]=0;
								Gary[k]=0;
								Gary[l]=0;
							}
						}
					}
				}
			}
			count=0;
			for(int j=0;j<9;j++) {
				if("B".equals(color[j])) {
					Bary[count]=num[j];
					count++;
				}
			}
			Arrays.sort(Bary);
			if(Bcount>=3) {
				for(int j=0;j<Bcount-2;j++) {
					for(int k=j+1;k<Bcount-1;k++) {
						for(int l=k+1;l<Bcount;l++) {
							if(((Bary[j]==Bary[k]-1 && Bary[j]==Bary[l]-2) || (Bary[j]==Bary[k] && Bary[j]==Bary[l])) && Bary[j]*Bary[k]*Bary[l]!=0) {
								alignedCount++;
								Bary[j]=0;
								Bary[k]=0;
								Bary[l]=0;
							}
						}
					}
				}
			}
			if(alignedCount==3) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}

}

