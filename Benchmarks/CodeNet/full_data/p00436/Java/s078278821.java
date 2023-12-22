import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] cards=new int[N*2+1];
		for(int i=0; i<2*N+1; i++) {
			cards[i]=i;
		}
		int syori=sc.nextInt();

		int mai=0;
		for(int i=0; i<syori; i++) {
			mai=sc.nextInt();
			if(mai>1) {
				int[] ue=new int[mai];
				int[] sita=new int[N*2-mai];

				for(int j=1; j<=mai; j++) {
					ue[j-1]=cards[j];
				}
				for(int j=1; j<=N*2-mai; j++) {
					sita[j-1]=cards[mai+j];
				}

				for(int j=1; j<=N*2; j++) {
					if(j<=N*2-mai) {
						cards[j]=sita[j-1];
					}
					else {
						cards[j]=ue[j-(N*2-mai)-1];
					}
				}
			}
			else if(mai==1){
				int ue=cards[1];
				for(int j=1; j<=N*2-1; j++) {
					cards[j]=cards[j+1];

				}
				cards[N*2]=ue;
			}
			else if(mai==0){
				int[] N1=new int[N];
				int[] N2=new int[N];

				for(int j=1; j<=N*2; j++) {
					if(j<=N) {
						N1[j-1]=cards[j];

					}
					else {
						N2[j-N-1]=cards[j];

					}
				}

				for(int j=1; j<=N*2; j++) {
					if(j%2==1) {
						cards[j]=N1[(j-1)/2];
					}
					else {
						cards[j]=N2[j/2-1];
					}
				}
			}
		}

		for(int i=1; i<=2*N; i++) {
			System.out.println(cards[i]);
		}
	}
}

