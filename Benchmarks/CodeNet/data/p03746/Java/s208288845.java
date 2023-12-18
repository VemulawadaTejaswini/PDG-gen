
import java.util.Scanner;


class Search {


	int N;
	int M;
	int[][] root;

	int[] path;

	int front;
	int back;

	void set(Scanner scan){

		N=scan.nextInt();
		M=scan.nextInt();

		path = new int[2*N];
		root = new int[N+1][N+1];
		front = N-1;
		back = N;

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


	}

	boolean Fcheck(){
		for(int i=0;i<N+1;i++){
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
						return true;
					}
				}

				}
			}
		//すべて含まれている
		return false;
	}

	boolean Echeck(){
		for(int i=0;i<N+1;i++){
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
						return true;
					}
				}

				}
			}
	return false;
}
}


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);


		Search search = new Search();
		search.set(scan);
		while(search.Fcheck());
		while(search.Echeck());

		System.out.println(search.back-search.front+1);
		for(int i=search.front;i<search.back+1;i++){
			System.out.print(search.path[i]+" ");
		}
		System.out.println("");
	}
}

