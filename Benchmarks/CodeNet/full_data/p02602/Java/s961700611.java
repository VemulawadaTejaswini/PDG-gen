import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for(int i = 0;i<N;++i){
			A.add(sc.nextInt());
		}
		sc.close();
		int[] point = new int[N-K+1];
		for(int i=0;i<N-K+1;++i){
			point[i] = 1;
		}
		for(int i=0;i<N-K+1;++i){
			for(int j=0;j<K;++j){
				point[i] += A.get(K+i-j-1);
			}
		}
		for(int i=0;i<N-K;++i){
			if(point[i+1]>point[i]){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}

