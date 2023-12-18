
import java.util.*;

import com.sun.scenario.effect.Effect;

public class Main {

	static final int INF = Integer.MAX_VALUE;			// 2147483647
	static final long LINF = Long.MAX_VALUE;			// 9223372036854775807
	static int DEBUG = 0;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[] Rs = new int[n];
		int[] Cs = new int[n];
		int[] As = new int[n];
		for (int i=0; i<n; i++) {
			Rs[i] = sc.nextInt() - 1;
			Cs[i] = sc.nextInt() - 1;
			As[i] = sc.nextInt();
		}
//		sc.close();
		
		int[][] Graphs = new int[r][c];
		int[] NodeRs = new int[r];
		int[] NodeCs = new int[c];
		int[][] Edges = new int[n][3];
		ArrayList<Integer> NokoriRs = new ArrayList<Integer>();
		ArrayList<Integer> NokoriCs = new ArrayList<Integer>();
		LinkedList<Integer> QueueRs = new LinkedList<Integer>();
		LinkedList<Integer> QueueCs = new LinkedList<Integer>();

		
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				Graphs[i][j] = -1;
			}
		}
		for (int i=0; i<n; i++) {
			Graphs[Rs[i]][Cs[i]] = As[i];
			Edges[i][0] = Rs[i];
			Edges[i][1] = Cs[i];
			Edges[i][2] = As[i];
		}
		for (int i=0; i<r; i++) {
			NodeRs[i] = - (INF - 10);
			NokoriRs.add(i);
		}
		for (int i=0; i<c; i++) {
			NodeCs[i] = - (INF - 10);
			NokoriCs.add(i);
		}
		
		while ((NokoriRs.size() + NokoriCs.size()) > 0) {
			if (NokoriRs.size() > 0) {
				int nowNodeR = NokoriRs.get(0);
				NodeRs[nowNodeR] = 0;
				NokoriRs.remove(0);
				for (int i=0; i<c; i++) {
					int nowA = Graphs[nowNodeR][i];
					if (nowA != -1) {
						if (NokoriCs.indexOf(i) >= 0) {
							QueueCs.offer(i);
							NodeCs[i] = nowA - NodeRs[nowNodeR];
							NokoriCs.remove(NokoriCs.indexOf(i));
						}
					}
				}
			} else {
				int nowNodeC = NokoriCs.get(0);
				NodeCs[nowNodeC] = 0;
				NokoriCs.remove(0);
				for (int i=0; i<r; i++) {
					int nowA = Graphs[i][nowNodeC];
					if (nowA != -1) {
						if (NokoriRs.indexOf(i) >= 0) {
							QueueRs.offer(i);
							NodeRs[i] = nowA - NodeRs[nowNodeC];
							NokoriRs.remove(NokoriRs.indexOf(i));
						}
					}
				}
			}
			
			if (DEBUG == 1) {
				p("----- 1st -----");
				pn("NodeRs : ");
				for (int i: NodeRs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("NodeCs : ");
				for (int i: NodeCs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("NokoriRs : ");
				for (int i: NokoriRs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("NokoriCs : ");
				for (int i: NokoriCs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("QueueRs : ");
				for (int i: QueueRs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("QueueCs : ");
				for (int i: QueueCs) {
					pn(i);
					pn(", ");
				}
				p("");
	
				int temp = sc.nextInt();
			}

			while ((QueueRs.size() + QueueCs.size()) > 0) {
				if (QueueRs.size() > 0) {
					int nowNodeR = QueueRs.poll();
					for (int i=0; i<c; i++) {
						int nowA = Graphs[nowNodeR][i];
						if (nowA != -1) {
							if (NokoriCs.indexOf(i) >= 0) {
								QueueCs.offer(i);
								NodeCs[i] = nowA - NodeRs[nowNodeR];
								NokoriCs.remove(NokoriCs.indexOf(i));
							}
						}
					}
				} else {
					int nowNodeC = QueueCs.poll();
					for (int i=0; i<r; i++) {
						int nowA = Graphs[i][nowNodeC];
						if (nowA != -1) {
							if (NokoriRs.indexOf(i) >= 0) {
								QueueRs.offer(i);
								NodeRs[i] = nowA - NodeCs[nowNodeC];
								NokoriRs.remove(NokoriRs.indexOf(i));
							}
						}
					}
				}
			}

			if (DEBUG == 1) {
				p("----- 2nd -----");
				pn("NodeRs : ");
				for (int i: NodeRs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("NodeCs : ");
				for (int i: NodeCs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("NokoriRs : ");
				for (int i: NokoriRs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("NokoriCs : ");
				for (int i: NokoriCs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("QueueRs : ");
				for (int i: QueueRs) {
					pn(i);
					pn(", ");
				}
				p("");
				pn("QueueCs : ");
				for (int i: QueueCs) {
					pn(i);
					pn(", ");
				}
				p("");
	
				int temp = sc.nextInt();
			}
			
		}
		
		// 矛盾がないか確認
		for (int i=0; i<n; i++) {
			if ((NodeRs[Edges[i][0]] + NodeCs[Edges[i][1]]) != Edges[i][2]) {
				p("No");
				return;
			}
		}
		
		if ((min(NodeRs) + min(NodeRs)) >= 0) {
			p("Yes");
		} else {
			p("No");
		}
		
		
	}
	
	
	
	public static void p(Number a) {
		System.out.println(a);		
	}
	public static void p(String a) {
		System.out.println(a);		
	}
	public static void p(char a) {
		System.out.println(a);		
	}
	public static void pn(Number a) {
		System.out.print(a);		
	}
	public static void pn(String a) {
		System.out.print(a);		
	}
	public static void pn(char a) {
		System.out.print(a);		
	}
	public static void pa(String[] As) {
		for (int i = 0; i<As.length; i++) {
			pn(As[i]);
			pn(", ");
		}
		p("");
	}
	public static void pa(Number[] As) {
		for (int i = 0; i<As.length; i++) {
			pn(As[i]);
			pn(", ");
		}
		p("");
	}
	public static void pa(int[] As) {
		for (int i = 0; i<As.length; i++) {
			pn(As[i]);
			pn(", ");
		}
		p("");
	}
	

	public static int powerInt(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public static int max(int arr[]) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static double max(double arr[]) {
		double max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}	
	public static int min(int arr[]) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static double min(double arr[]) {
		double max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static char Num2Char(int num) {
		return (char)(num + 'a');
	}
	public static int Char2Num(char c) {
		return (int)(c - 'a');
	}
	



}
