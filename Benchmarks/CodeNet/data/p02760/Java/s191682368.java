import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] bi =new int[3][3];
		boolean[][] fl=new boolean[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				bi[i][j]=sc.nextInt();
				fl[i][j]=false;
			}
		}
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			int tmp=sc.nextInt();
			for(int k=0; k<3; k++) {
				for(int l=0; l<3; l++) {
					if(bi[k][l]==tmp) {
						fl[k][l]=true;
					}
				}
			}
		}
		boolean kekka =true;
		int cnt=0;
		for(int i=0; i<3; i++) {
			kekka =true;
			for(int j=0; j<3; j++) {
				if(fl[i][j] && kekka) {
					//
				}
				else {
					kekka=false;
				}
			}
			if(kekka) {
				cnt++;
			}
		}

		for(int j=0; j<3; j++) {
			kekka =true;
			for(int i=0; i<3; i++) {
				if(fl[i][j] && kekka) {
					//
				}
				else {
					kekka=false;
				}
			}
			if(kekka) {
				cnt++;
			}
		}
		kekka=true;
		for(int i=0; i<3; i++) {
			if(fl[i][i] && kekka) {
				//
			}
			else {
				kekka=false;
			}
		}
		if(kekka) {
			cnt++;
		}

		kekka=true;
		for(int i=0; i<3; i++) {
			if(fl[i][2-i] && kekka) {
				//
			}
			else {
				kekka=false;
			}
		}
		if(kekka) {
			cnt++;
		}
		if(cnt>0) {
			pl("Yes");
		}
		else {
			pl("No");
		}

	}
	public static void pl(Object o) {
		System.out.println(o);
	}
}