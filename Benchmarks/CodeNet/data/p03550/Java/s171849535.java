import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int Z = Integer.parseInt(sc.next());
	int W =	Integer.parseInt(sc.next());
	int[] a	= new int[N];

	for(int i = 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
	}

	System.out.println(Math.max((int)Math.abs(a[N-1]-W),(int)Math.abs(a[N-1]-a[N-2])));


    }
}