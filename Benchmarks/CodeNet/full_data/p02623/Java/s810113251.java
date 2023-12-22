import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		for(int i = 0; i < M; i++){
			A.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			B.add(sc.nextInt());
		}
		A.add(1000000001);
		B.add(1000000001);
		int indexA = 0;
		int indexB = 0;
		int time = 0;
		int count = 0;
		while(true){
			if(A.get(indexA) <= B.get(indexB)){
				if(A.get(indexA) + time <= K){
					time += A.get(indexA);
					indexA++;
				}else{
					break;
				}
			}else if(A.get(indexA) => B.get(indexB)){
				if(B.get(indexB) + time <= K){
					time += B.get(indexB);
					indexB++;
				}else{
					break;
				}
			}else if(A.get(indexA) == 1000000001 && B.get(indexB) == 1000000001){
				break;
			}
			count++;
		}
		System.out.print(count);
	}
}