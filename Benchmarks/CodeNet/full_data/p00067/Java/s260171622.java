import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] island=new int[12][12];
		while(sc.hasNext()) {
			for(int i=0;i<12;i++) {
				String island_wide_num=sc.next();
				for(int j=0;j<12;j++) {
					island[i][j]=Integer.parseInt(island_wide_num.substring(j,j+1));
				}
			}
			//島(1)を探す
			//"1"の周りにある"1"(上下左右)を全て"2"にする...①
			//初めの"1"を中心に"2"の周りにある"1"を"3"にする...②
			//"3"の周囲にあるものの全ての"1"を"3"にするを配列の最後まで繰り返す...③
			//①～③を繰り返す
			for(int i=0;i<12;i++) {
				for(int j=0;j<12;j++) {
					if(island[i][j]==1) {
						if(j==11) {
						}else if(island[i][j+1]==1) {//right
							island[i][j+1]=2;
							if(j==10) {
							}else if(island[i][j+2]==1) {//right_right
								island[i][j+2]=3;
							}
							if(i==11) {
							}else if(island[i+1][j+1]==1) {//right_under
								island[i+1][j+1]=3;
							}
						}
						if(i==11) {
						}else if(island[i+1][j]==1) {//under
							island[i+1][j]=2;
							if(j==11) {
							}else if(island[i+1][j+1]==1) {//under_right
								island[i+1][j+1]=3;
							}
							if(j==0) {
							}else if(island[i+1][j-1]==1) {//under_left
								island[i+1][j-1]=3;
							}
							if(i==10) {
							}else if(island[i+2][j]==1) {//under_under
								island[i+2][j]=3;
							}
						}
						for(int ref1=0;ref1<12;ref1++) {
							for(int ref2=0;ref2<12;ref2++) {
								if(island[ref1][ref2]==3) {//上下左右に"1"があった場合、そこを"3"にする
									if(ref1==0) {
									}else if(island[ref1-1][ref2]==1) {//up
										island[ref1-1][ref2]=3;
									}

									if(ref1==11) {
									}else if(island[ref1+1][ref2]==1) {//under
										island[ref1+1][ref2]=3;
									}

									if(ref2==11) {
									}else if(island[ref1][ref2+1]==1) {//right
										island[ref1][ref2+1]=3;
									}

									if(ref2==0) {
									}else if(island[ref1][ref2-1]==1) {//left
										island[ref1][ref2-1]=3;
									}
								}
							}
						}
					}
				}
			}
			//System.out.println();
			/*for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.print(island[i][j]);
			}
			System.out.println();
			}*/
			int count=0;
			for(int i=0;i<12;i++) {
				for(int j=0;j<12;j++) {
					if(island[i][j]==1) {
						count++;
					}
				}
			}
			System.out.println(count);
			}

	}

}

