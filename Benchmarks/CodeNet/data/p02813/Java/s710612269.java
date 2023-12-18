import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] P = new String[N];
		String[] Q = new String[N];
		for(int i = 0; i < N; i++) {
			P[i] = sc.next();
		}
		for(int i = 0; i < N; i++) {
			Q[i] = sc.next();
		}
		sc.close();
		String[] data = new String[N];
		for(int i = 0; i < N; i++) {
			data[i] = String.valueOf(i + 1);
		}
		// 順列の作成
		List<List<String>> perm = get(data);
		// 検索
		int p = perm.indexOf(Arrays.asList(P)) + 1;
		int q = perm.indexOf(Arrays.asList(Q)) + 1;
		System.out.println(Math.abs(p - q));
	}

	static List<List<String>> get(String[] data) {
		return permutation(data);
	}

    // static void print(String[] data) {
    //     int number = 0;
    //     for (List<String> comb : permutation(data)) {
    //         System.out.println("#" + ++number + " " + Arrays.asList(comb));
    //     }
	// }
	
    static <T> List<List<T>> permutation(T[] data) {
        List<List<T>> result = new ArrayList<List<T>>();
		// 候補の配列
		List<T> candidate = new ArrayList<>(Arrays.asList(data));
		// 順列の配列
		List<T> perm = new ArrayList<>();
		permutation(candidate, perm, result);
        return result;
    }
	
    static <T> void permutation(List<T> candidate, List<T> perm, List<List<T>> result) {
		if(candidate.size() == 0) {
			// System.out.println("##" + perm.toString());
			result.add(perm);
		}
		for(int i = 0; i < candidate.size(); i++) {
			List<T> p = new ArrayList<>(perm);
			List<T> c = new ArrayList<>(candidate);
			p.add(c.get(i));
			c.remove(i);
			permutation(c, p, result);
		}
	}
}