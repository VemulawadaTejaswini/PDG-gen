import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrayA = new int[m];
		int[] arrayB = new int[m];
		for(int i=0;i<m;i++) {
			arrayA[i]=sc.nextInt();
			arrayB[i]=sc.nextInt();
		}
		sc.close();

		UnionFind uf = new UnionFind(n);
		for(int i=0;i<m;i++) {
			uf.join(arrayA[i]-1,arrayB[i]-1);
		}

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(uf.root(i));
        }
        System.out.println(set.size() -1);
	}

	static class UnionFind {
		int[] p;
		int n;
		UnionFind(int n) {
			this.n = n;
			p = new int[n];

			for(int i=0; i<n; i++){
				p[i] = i;
			}
		}

		int root(int a) {
			if(p[a] == a) {
				return a;
			}

			int res =  root(p[a]);
			p[a] = res;

			return res;
		}

		void join(int a ,int b) {
			p[root(a)] = p[root(b)];
			}
		}

	}