import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int X = Integer.parseInt(sc.next());
	int Y = Integer.parseInt(sc.next());
	int Z = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());

	Long[] A = new Long[X];
	Long[] B = new Long[Y];
	Long[] C = new Long[Z];

	for(int i = 0; i<X; i++) A[i] = Long.parseLong(sc.next());
	for(int i = 0; i<Y; i++) B[i] = Long.parseLong(sc.next());
	for(int i = 0; i<Z; i++) C[i] = Long.parseLong(sc.next());

	//Arrays.sort(A, Comparater.reverseOrder());
	//Arrays.sort(B, Comparater.reverseOrder());
	//Arrays.sort(C, Comparater.reverseOrder());

	Long[] AB = new Long[X*Y];
	int c = 0;
	for(int i = 0; i<X; i++) {
	    for(int j = 0; j<Y; j++) {
		AB[c] = A[i] + B[j];
		c++;
	    }
	}
	Arrays.sort(AB, Comparator.reverseOrder());

	Long[] ABC = new Long[K*Z];
	c = 0;
	for(int i = 0; i<K; i++) {
            for(int j = 0; j<Z; j++) {
		ABC[c] = AB[i] + C[j];
		c++;
            }
        }

	Arrays.sort(ABC, Comparator.reverseOrder());
	for(int i = 0; i<K; i++) {
	    System.out.println(ABC[i]);
	}

    }
}