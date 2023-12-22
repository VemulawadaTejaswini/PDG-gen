import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		UnionFind UF = new UnionFind(n);
		int m = sc.nextInt();
		for(int i = 0;i < m;i++){
			int num = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(num == 0){
				UF.unite(x,y);
			}else{
				System.out.println(UF.same(x,y) ? 1 : 0);
			}
		}
	}
	public static class UnionFind {
        final int[] data;

        public UnionFind(int size) {
            data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = i;
            }
        }

        int find(int x) {
            if (data[x] == x) return x;
            else return data[x] = find(data[x]);
        }

        void unite(int x, int y) {
            data[find(x)] = data[find(y)];
        }

        boolean same(int x, int y) {
            return find(x) == find(y);
        }
    }
//	public Main(){
//		new A().doIt();
//	}
//	class A{
//		void doIt(){
//			
//		}
//	}
}