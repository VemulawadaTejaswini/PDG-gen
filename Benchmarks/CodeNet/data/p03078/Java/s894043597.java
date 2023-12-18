
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int K=sc.nextInt();

		ArrayList<Long> A = new ArrayList<>();
		ArrayList<Long> B = new ArrayList<>();
		ArrayList<Long> C = new ArrayList<>();

		for(int i=0; i<X; i++) A.add(sc.nextLong());
		for(int i=0; i<Y; i++) B.add(sc.nextLong());
		for(int i=0; i<Z; i++) C.add(sc.nextLong());

		Collections.sort(A, Collections.reverseOrder());
		Collections.sort(B, Collections.reverseOrder());
		Collections.sort(C, Collections.reverseOrder());

		ArrayList<Long> ABC = new ArrayList<>();
		for(int i=0; i<X; i++) {
			for(int j=0; j<Y; j++) {
				if((i+1)*(j+1)>K) break;
				for(int k=0; k<Z; k++) {
					if((i+1) * (j+1) * (k+1) > K) break;
					ABC.add(A.get(i)+B.get(j)+C.get(k));
				}
			}
		}
		Collections.sort(ABC, Collections.reverseOrder());

		for(int i=0; i<K; i++) {
			System.out.println(ABC.get(i));
		}

		sc.close();
	}

}
