import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean[] moji=new boolean[10];
		for(int i=0; i<10; i++) {
			moji[i]=true;
		}
		int N=sc.nextInt();
		int K=sc.nextInt();
		for(int i=0; i<K; i++) {
			moji[sc.nextInt()]=false;
		}
		int[] ss=new int[10-K];
		int a=0;
		for(int i=0; i<10; i++) {
			if(moji[i]) {
				ss[a]=i;
				a++;
			}
		}
		int min=114514;
		int tmp=0;
		for(int i=0; i<10-K; i++) {
			for(int j=0; j<10-K; j++) {
				for(int k=0; k<10-K; k++) {
					for(int l=0; l<10-K; l++) {
						tmp=1000*ss[i]+100*ss[j]+10*ss[k]+ss[l];
						if(tmp<min && tmp>=N) {
							min=tmp;
						}
					}
				}
			}
		}
		for(int i=0; i<10-K; i++) {
			for(int j=0; j<10-K; j++) {
				for(int k=0; k<10-K; k++) {
					tmp=100*ss[i]+10*ss[j]+ss[k];
					if(tmp<min && tmp>=N) {
						min=tmp;
					}
				}
			}
		}
		for(int i=0; i<10-K; i++) {
			for(int j=0; j<10-K; j++) {
				tmp=10*ss[i]+ss[j];
				if(tmp<min && tmp>=N) {
					min=tmp;
				}
			}
		}
		for(int i=0; i<10-K; i++) {
			tmp=ss[i];
			if(tmp<min && tmp>=N) {
				min=tmp;
			}
		}
		System.out.println(min);
	}
}