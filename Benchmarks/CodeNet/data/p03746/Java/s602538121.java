
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int N=Integer.parseInt(scan.next());
		int M=Integer.parseInt(scan.next());

		Root[] root = new Root[N+1];
		for(int i=0;i<N+1;i++){
			root[i] = new Root();
		}



		LinkedList<Integer> path = new LinkedList<Integer>();
			for(int i=0;i<M;i++){
				int a=Integer.parseInt(scan.next());
				int b=Integer.parseInt(scan.next());

				root[a].add(b);
				root[b].add(a);

				if(i==0){
					path.add(a);
					path.add(b);
				}
			}

			int F;
			int nextF;
			int flag=0;
		while(flag<root[path.getFirst()].size()-1){
			F = path.getFirst();
			for(int i=0;i<root[F].size();i++){
				nextF = root[F].get(i);
					//先頭と繋がれた場所がパス内にあるかどうか
					if(path.contains(nextF)){
						flag++;
						continue;//パス内にあれば次の場所について調べる
					}else{
						path.addFirst(nextF);
						root[nextF].removeFirstOccurrence(F);
						flag = 0;
						break;//無ければ追加して先頭を更新する
					}

				}

		}


		flag =0;
		while(flag<root[path.getLast()].size()-1){
			F = path.getLast();
			for(int i=0;i<root[F].size();i++){
				nextF = root[F].get(i);
				//先頭と繋がれた場所がパス内にあるかどうか
				if(path.contains(nextF)){
					flag++;
					continue;//パス内にあれば次の場所について調べる
				}else{
					path.addLast(nextF);
					root[nextF].removeFirstOccurrence(F);
					flag = 0;
					break;//無ければ追加して先頭を更新する
				}


				}

	}

		System.out.println(path.size());
		for(int i=0;i<path.size();i++){
			System.out.print(path.get(i)+" ");
		}
		System.out.println("");
	}
}

class Root extends LinkedList<Integer>{

}

