import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(),H=sc.nextInt(),N=sc.nextInt();
		int[] arrayx = new int[N];
		int[] arrayy = new int[N];
		int[] arraya = new int[N];
		int maxX=W,minX=0,maxY=H,minY=0;

		for(int i=0;i<N;i++) {
			arrayx[i] = sc.nextInt();
			arrayy[i] = sc.nextInt();
			arraya[i] = sc.nextInt();
		}

		for(int i=0;i<N;i++) {
			if(arraya[i]==1 && arrayx[i]>=minX) {
				minX=arrayx[i];
			}else if(arraya[i]==2 && arrayx[i]<=maxX) {
				maxX=arrayx[i];
			}else if(arraya[i]==3 && arrayy[i]>=minY) {
				minY=arrayy[i];
			}else if(arraya[i]==4 && arrayy[i]<=maxY){
				maxY=arrayy[i];
			}
			//System.out.println(minX+" "+maxX+" "+minY+" "+maxY);
		}


		if((maxX-minX)>=0&&(maxY-minY)>=0) {
			System.out.println((maxX-minX)*(maxY-minY));
		}else {
			System.out.println(0);
		}


	}
	public static int sample(int n) {
		return n;
	}

}
