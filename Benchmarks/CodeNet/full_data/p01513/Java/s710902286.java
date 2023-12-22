import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();//構成員の数
				//int M;//個人情報数
				boolean[][] p=new boolean[110][110];//構成員が知っている個人情報
				for(int i=1; i<=N; i++) {
					int M=sc.nextInt();
					for(int j=0; j<M; j++) {
						int num=sc.nextInt();
						p[i][num]=true;
					}
				}
				
				int K=sc.nextInt();//漏洩した構成員の人数
				int[] k=new int[110];
				for(int i=1; i<=K; i++) {
					int l=sc.nextInt();
					for(int j=1; j<=N; j++) {
						if(p[j][l]) {
							k[j]++;
						}
					}
				}
				int end=0;
				int person=0;
				for(int i=1; i<=N; i++) {
					if(k[i]==K) {
						end++;
						person=i;
					}
				}
				if(end==1) {
					System.out.println(person);
				}
				else {
					System.out.println(-1);
				}
			}


		}
	}
}
