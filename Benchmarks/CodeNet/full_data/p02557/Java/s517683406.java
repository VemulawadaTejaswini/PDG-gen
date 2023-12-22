import java.util.*;
public class Main {
  	static int[] A;
  	static boolean found = false;
    private static void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

    private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
		if(found) return;
      if (index == seed.length) {
            procPerm(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }
    private static void procPerm(int[] perm) {
        boolean matched = false;
		for (int i = 0; i < perm.length; i++) {
          	if (perm[i] == A[i]) {
              matched = true;
              break;
            }
        }
      	if(matched != true) {
      		System.out.println(Arrays.toString(perm));
          	found = true;
        }
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	A = new int[a];
      	for(int i= 0; i< a; i++) {
          A[i] = sc.nextInt();
        }
       	int[] B = new int[a];
      	for(int i= 0; i< a; i++) {
          B[i] = sc.nextInt();
        }
        permutation(B);
		if(!found) {
          
       System.out.println("No");
        }
	}
}