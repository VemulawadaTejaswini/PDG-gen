import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int K=sc.nextInt();

		List<Long> A=new ArrayList<>();
		List<Long> B=new ArrayList<>();
		List<Long> C=new ArrayList<>();

		for(int i=0;i<X;i++) A.add(sc.nextLong());

		for(int i=0;i<Y;i++) B.add(sc.nextLong());

		for(int i=0;i<Z;i++) C.add(sc.nextLong());

		List<Long> AB=new ArrayList<>();

		for(int i=0;i<X;i++) {
			for(int j=0;j<Y;j++) {
				AB.add(A.get(i)+B.get(j));
			}
		}

		Collections.sort(AB, Collections.reverseOrder());

		List<Long> ABC=new ArrayList<>();

		for(int i=0;i<Math.min(K, AB.size());i++) {
			for(int j=0;j<Z;j++) {
				ABC.add(AB.get(i)+C.get(i));
			}
		}

		Collections.sort(ABC, Collections.reverseOrder());

		for(int i=0;i<K;i++) System.out.println(ABC.get(i));

		sc.close();

	}

}
