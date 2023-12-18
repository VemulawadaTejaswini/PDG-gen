
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int N=scan.nextInt();
		int M=scan.nextInt();

		int[][] root = new int[N+1][N+1];
		int[] path = new int[2*N];
		int front = N-1;
		int back = N;
			for(int i=0;i<M;i++){
				int a=scan.nextInt();
				int b=scan.nextInt();

				root[a][b]=1;
				root[b][a]=1;

				if(i==0){
					path[N-1]=a;
					path[N]=b;
				}
			}

			int flag=0;
		while(flag==0){
outside:	for(int i=0;i<N+1;i++){
				if(root[path[front]][i]==1){//先頭と繋がれた場所
					for(int j=front;j<2*N;j++){

						if(path[j]==i){
							//含まれているので次のループへ
							break;
						}

						if(path[j]==0){
							//含まれていない
							path[front-1]=i;
							front--;
							break outside;
						}
					}


					}
				if(i==N)flag=1;
				}

			//すべて含まれている

		}


		flag =0;
		while(flag==0){
outside:	for(int i=0;i<N+1;i++){
				if(root[path[back]][i]==1){//最後と繋がれた場所
					for(int j=front;j<=2*N;j++){

						if(path[j]==i){
							//含まれているので次のループへ
							break;
						}

						if(path[j]==0){
							//含まれていない
							path[back+1]=i;
							back++;
							break outside;
						}
					}

					}
				if(i==N)flag=1;
				}

	}

		System.out.println(back-front+1);
		for(int i=front;i<back+1;i++){
			System.out.print(path[i]+" ");
		}
		System.out.println("");
	}
}

