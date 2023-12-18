import java.util.*;

class Main {
	public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        //int ans[] = new int[N];
        for(int i=0; i<K; i++) {
            int d = sc.nextInt();
            int[] A = new int[d];
            A[i] = sc.nextInt();
            array.add(A[i]);
        }
        System.out.println(N-array.size());
	}
}