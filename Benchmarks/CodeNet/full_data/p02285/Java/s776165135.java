import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static StringBuilder ans = new StringBuilder();

	public static void main(String[] args) {
		int n = sc.nextInt();

		Node_BT[] nodes = new Node_BT[n];
		for(int i=0; i<n; i++) {
			nodes[i] = new Node_BT();
		}

		for(int i=0; i<n; i++) {
			String cmd = sc.next();

			if(cmd.equals("insert")) {
				int key = sc.nextInt();
				nodes[i].id = i;
				nodes[i].key = key;

				if(i != 0) {
					int x = 0;

					while(nodes[x].left != -1 || nodes[x].right != -1) {

						if(nodes[i].key < nodes[x].key) {
							if(nodes[x].left == -1) {
								break;
							}
							x = nodes[x].left;
						} else {
							if(nodes[x].right == -1) {
								break;
							}
							x = nodes[x].right;
						}
					}

					nodes[i].parent = x;

					if(nodes[i].key < nodes[x].key) {
						nodes[x].left = i;
					} else {
						nodes[x].right = i;
					}
				}

			} else if(cmd.equals("print")) {
				nodes[0].inOrder(nodes);
				ans.append("\n");
				nodes[0].preOrder(nodes);
				ans.append("\n");

			} else if(cmd.equals("find")){
				int key = sc.nextInt();
				if(nodes[0].findKey(nodes, key) != -1) {
					ans.append("yes\n");
				} else {
					ans.append("no\n");
				}

			} else {
				int z_key = sc.nextInt();
				int z_id = nodes[0].findKey(nodes, z_key);

				if(nodes[z_id].left == -1 && nodes[z_id].right == -1) {
					if(nodes[nodes[z_id].parent].left == z_id) {
						nodes[nodes[z_id].parent].left = -1;
					} else {
						nodes[nodes[z_id].parent].right = -1;
					}

				} else if(nodes[z_id].right == -1) {
					if(nodes[nodes[z_id].parent].left == z_id) {
						nodes[nodes[z_id].parent].left = nodes[z_id].left;
						nodes[nodes[z_id].left].parent = nodes[z_id].parent;
					} else {
						nodes[nodes[z_id].parent].right = nodes[z_id].left;
						nodes[nodes[z_id].left].parent = nodes[z_id].parent;
					}

				} else if(nodes[z_id].left == -1) {
					if(nodes[nodes[z_id].parent].left == z_id) {
						nodes[nodes[z_id].parent].left = nodes[z_id].right;
						nodes[nodes[z_id].right].parent = nodes[z_id].parent;
					} else {
						nodes[nodes[z_id].parent].right = nodes[z_id].right;
						nodes[nodes[z_id].right].parent = nodes[z_id].parent;
					}

				} else {
					int y_id = nodes[z_id].right;
					while(nodes[y_id].left != -1) {
						y_id = nodes[y_id].left;
					}
					nodes[y_id].key = nodes[z_id].key;

					if(nodes[y_id].left == -1 && nodes[y_id].right == -1) {
						if(nodes[nodes[y_id].parent].left == y_id) {
							nodes[nodes[y_id].parent].left = -1;
						} else {
							nodes[nodes[y_id].parent].right = -1;
						}

					} else if(nodes[y_id].right == -1) {
						if(nodes[nodes[y_id].parent].left == y_id) {
							nodes[nodes[y_id].parent].left = nodes[y_id].left;
							nodes[nodes[y_id].left].parent = nodes[y_id].parent;
						} else {
							nodes[nodes[y_id].parent].right = nodes[y_id].left;
							nodes[nodes[y_id].left].parent = nodes[y_id].parent;
						}

					} else if(nodes[y_id].left == -1) {
						if(nodes[nodes[y_id].parent].left == y_id) {
							nodes[nodes[y_id].parent].left = nodes[y_id].right;
							nodes[nodes[y_id].right].parent = nodes[y_id].parent;
						} else {
							nodes[nodes[y_id].parent].right = nodes[y_id].right;
							nodes[nodes[y_id].right].parent = nodes[y_id].parent;
						}

					} else {
						System.out.println("Error");
					}
				}

			}
		}

		System.out.print(ans);
	}

	static class Node_BT {
		int id;
		int left = -1;
		int right = -1;
		int parent = -1;
		int key;

		void preOrder(Node_BT[] nodes) {
			ans.append(" ");
			ans.append(key);
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
			ans.append(" ");
			ans.append(key);
			if(right != -1) {
				nodes[right].inOrder(nodes);
			}
		}

		int findKey(Node_BT[] nodes, int key) {
			if(this.key == key) {
				return id;
			} else if(key < this.key) {
				if(left == -1) {
					return -1;
				} else {
					return nodes[left].findKey(nodes, key);
				}
			} else {
				if(right == -1) {
					return -1;
				} else {
					return nodes[right].findKey(nodes, key);
				}
			}
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