import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] keta=new int[N+1];
		boolean val=true;
		Arrays.fill(keta,-1);
		for(int i=0; i<M; i++) {
			int s=sc.nextInt();
			int c=sc.nextInt();
			if(keta[s]==-1) {
				keta[s]=c;
			}
			else if(keta[s]!=-1 && keta[s] != c){
				val =false;		//矛盾
			}
		}
		if(!val) {
			pl(-1);
			System.exit(0);
		}
		if(N==1) {
			if(keta[1]==-1) {
				pl(0);
			}
			else {
				pl(keta[1]);
			}
		}
		else if(N==2) {
			if(keta[1]==0) {
				pl(-1);
			}
			else if(keta[1]==-1) {
				keta[1]=1;		//条件なしのとき、
			}
			keta[2] = Math.max(keta[2], 0);
			pl(keta[1]*10+keta[2]);
		}
		else if(N==3) {
			if(keta[1] == 0 ) {
				pl(-1);
			}
			else {
				for(int i=1; i<=3; i++) {
					keta[i]=Math.max(keta[i], 0);
				}
				pl(keta[1]*100+keta[2]*10+keta[3]);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
}