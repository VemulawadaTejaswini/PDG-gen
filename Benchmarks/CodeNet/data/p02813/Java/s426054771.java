import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			int[] pArray = new int[n];
			int[] qArray = new int[n];

			for(int i = 0 ; i < n ; i++ ) {
				pArray[i] = sc.nextInt();
			}

			for(int i = 0 ; i < n ; i++ ) {
				qArray[i] = sc.nextInt();
			}

			//先頭が違う場合 p2..pn < seq(p2,pn)となるseqの数
			//p1 < r < q1となるseqの数
			//(q2, qn) < seq(q2, qn)となるseqの数
			//上記は最初に違う数がきた箇所に対して適用可能
			// --> 以下は違う解き方

			List<Integer> seq = new ArrayList<>();
			for(int i = 0 ; i < n ; i++ ) {
				seq.add(i+1);
			}

			List<List<Integer>> comb = make(seq);

			//			for(List<Integer> lst : comb) {
			//				for(int i : lst ) {
			//					System.out.print(i);
			//				}
			//				System.out.println();
			//			}

			int pNum = -1;
			int qNum = -1;

			for(int i = 0 ; i < comb.size() ; i++ ) {
				List<Integer> aSeq = comb.get(i);

				if ( pNum == - 1 ) {
					boolean pMatch = true;
					for(int j = 0 ; j < n ; j++ ) {
						if (pArray[j] != aSeq.get(j) ) {
							pMatch = false;
							break;
						}
					}
					if ( pMatch ) {
						pNum = i;
					}
				}
				if ( qNum == -1 ) {
					boolean qMatch = true;
					for(int j = 0 ; j < n ; j++ ) {
						if (qArray[j] != aSeq.get(j) ) {
							qMatch = false;
							break;
						}
					}
					if ( qMatch ) {
						qNum = i;
					}
				}
			}
			
			System.out.println(Math.abs(pNum - qNum));
		}
	}

	public static List<List<Integer>> make(List<Integer> candidate) {
		// 候補がないなら、順列は空リストを返す
		if (candidate.size() == 0) {
			List<List<Integer>> empty = new ArrayList<>();
			empty.add(new ArrayList<>());
			return empty;
		}

		// candidateから1文字ずつピックアップする
		// flatMapを使ってるので1文字はiに格納されるはず
		return candidate.stream().flatMap(i -> {
			// 残りの配列はcandidateからiを省いたものである
			List<Integer> rest = new ArrayList<>(candidate);
			rest.remove(i);
			// 残りの配列で順列のリストを作り、
			// 先頭にピックアップした文字を結合
			return make(rest).stream().map(list -> {
				list.add(0, i);
				return list;
			});
		}).collect(Collectors.toList());
		// flatMapを使っているので、1文字ずつピックアップして
		// 全文字の操作が終わったら、全ての操作で得られたリストを
		// 結合して返しているはず
	}
}