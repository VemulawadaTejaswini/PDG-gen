import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();

		Node_BT[] nodes = new Node_BT[n];
		for(int i=0; i<n; i++) {
			nodes[i] = new Node_BT();
		}

		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			int left = sc.nextInt();
			int right = sc.nextInt();
			nodes[id].id = id;
			nodes[id].left = left;
			nodes[id].right = right;

			if(left != -1) {
				nodes[left].parent = id;
			}
			if(right != -1) {
				nodes[right].parent = id;
			}
		}

		for(int i=0; i<n; i++) {
			if(nodes[i].parent == -1) {
				System.out.println("Preorder");
				nodes[i].preOrder(nodes);
				System.out.println();
				System.out.println("Inorder");
				nodes[i].inOrder(nodes);
				System.out.println();
				System.out.println("Postorder");
				nodes[i].postOrder(nodes);
				System.out.println();
				break;
			}
		}

	}

	static class Node_BT {
		int id;
		int left;
		int right;
		int parent = -1;

		void preOrder(Node_BT[] nodes) {
			System.out.print(" " + id);
			if(left != -1) {
				nodes[left].preOrder(nodes);
			}
			if(right != -1) {
				nodes[right].preOrder(nodes);
			}
		}

		void inOrder(Node_BT[] nodes) {
			if(left != -1) {
				nodes[left].inOrder(nodes);
			}
			System.out.print(" " + id);
			if(right != -1) {
				nodes[right].inOrder(nodes);
			}
		}

		void postOrder(Node_BT[] nodes) {
			if(left != -1) {
				nodes[left].postOrder(nodes);
			}
			if(right != -1) {
				nodes[right].postOrder(nodes);
			}
			System.out.print(" " + id);
		}
	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}