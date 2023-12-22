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
		long point = 1;
		for(int i=0;i<N-K+1;++i){
			point *= A.get(K+i-1);
		}
		for(int i=0;i<N-K;++i){
			if(point/A.get(K+i-1)>point/A.get(K+i)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}

