import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Pair> pairs = new ArrayList<>();
		for(int i=0;i<M;i++) {
			Pair pair = new Pair();
			pair.number=sc.nextInt();
			pair.result=sc.next();
			pairs.add(pair);
		}
		int correctCount = 0;
		int penaltyCount = 0;
		ArrayList<Triple> triples = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			Triple triple = new Triple();
			triple.number=i;
			triple.account=0;
			triple.wacount=0;
			boolean flag = true;
			for(Pair pair:pairs) {
				if(pair.number==i) {
					if(pair.result.equals("AC")) {
						triple.account=1;
						flag = false;
					}else {
						if(flag) {
							triple.wacount++;
						}
					}
				}
			}
			triples.add(triple);
		}
		
		for(Triple triple:triples) {
			if(triple.account==1) {
				correctCount++;
				penaltyCount+=triple.wacount;
			}
		}
		System.out.print(correctCount+" "+penaltyCount);
		
	}

}
class Pair{
	int number;
	String result;
}
class Triple{
	int number;
	int account;
	int wacount;
}
