import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int Q =scan.nextInt();

		Pair[] pair = new Pair[M];
		Pair[] qpair = new Pair[Q];



		for(int i = 0;i < M;i++){
			pair[i] = new Pair();
			pair[i].from = scan.nextInt();
			pair[i].end = scan.nextInt();
		}

		Arrays.sort(pair);

		for(int i = 0;i < Q;i++){
			qpair[i] = new Pair();
			qpair[i].from = scan.nextInt();
			qpair[i].end = scan.nextInt();
		}


		for(int i = 0;i < M;i++){
			//			System.out.println("左 :"+pair[i].from+"右 :"+ pair[i].end);
		}
		for(int i = 0;i < Q;i++){

			//			System.out.println("質問左 :"+qpair[i].from+"質問右 :"+ qpair[i].end);
		}


		int count = 0;

		for(int i =0;i < Q;i++){
			for(int j = 0;j < M;j++){


				if(qpair[i].end >= pair[j].end){
					if(qpair[i].from <= pair[j].from){

						count++;
					}
				}else{
					break;
			}
		}
		System.out.println(count);
		count= 0;

	}






}



}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
