import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cards[][]=new int[4][14];
		boolean data[][]=new boolean[4][14];
		for(int i=0;i<4;i++){
			for(int j=1;j<=13;j++){
				cards[i][j]=j;
				data[i][j]=false;
			}
		}
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			char mark=sc.next().charAt(0);
			int num=sc.nextInt();
			if(mark=='S') data[0][num]=true;
			if(mark=='H') data[1][num]=true;
			if(mark=='C') data[2][num]=true;
			if(mark=='D') data[3][num]=true;
		}
		for(int i=0;i<4;i++){
			for(int j=1;j<=13;j++){
				if(data[i][j]==false){
					if(i==0) System.out.println("S "+j);
					if(i==1) System.out.println("H "+j);
					if(i==2) System.out.println("C "+j);
					if(i==3) System.out.println("D "+j);
				}
			}
		}
	}
}