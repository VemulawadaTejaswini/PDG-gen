import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			ArrayList <Vector <Integer>> vectors = new ArrayList <Vector <Integer>>();  //VectorのArrayListを生成
			for (int i=0; i<n; i++) {
				vectors.add(new Vector<Integer>());  //n個のvectorを追加
			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int request = sc.nextInt();
				int vec = sc.nextInt();
				switch (request) {
				case 0:
					int x = sc.nextInt();
					vectors.get(vec).add(x);
					break;

				case 1:
					if (vectors.get(vec).size() != 0) {  //空じゃなかったら
						for (int j=0; j<vectors.get(vec).size(); j++) {
							System.out.print(vectors.get(vec).get(j));
							if (j < vectors.get(vec).size()-1) System.out.print(' ');
							else System.out.print('\n');
						}
					} else System.out.print('\n');
					break;

				case 2:
					if (vectors.get(vec).size() != 0) {  //元々空だったらなにもしない
						vectors.remove(vec);
						vectors.add(vec,new Vector<Integer>());
					}
					break;
				}
			}
		}
	}
}
