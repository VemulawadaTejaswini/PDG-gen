import java.util.Scanner;


public class Main{

	static int[] parent;
	static int[] height;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] tmp = s.nextLine().split(" ");
		int edgeCnt = Integer.parseInt(tmp[0]);
		parent = new int[edgeCnt];
		height = new int[edgeCnt];
		for(int k=0 ; k<edgeCnt ; k++) {
			parent[k] = -1;
		}
		int direCnt = Integer.parseInt(tmp[1]);
		for(int i=0 ; i<direCnt ; i++) {
			String[] tmp1 = s.nextLine().split(" ");
			if("0".equals(tmp1[0])) {
				unite(Integer.parseInt(tmp1[1]), Integer.parseInt(tmp1[2]));
			}else {
				System.out.println(same(Integer.parseInt(tmp1[1]), Integer.parseInt(tmp1[2])));
			}
		}

	}

	public static void unite(int formmer, int latter) {
		while(parent[formmer]!=-1) {
			formmer = parent[formmer];
		}
		while(parent[latter]!=-1) {
			latter = parent[latter];
		}
		if(formmer==latter)
			return;
		if(height[formmer]==height[latter] && formmer>latter) {
			parent[formmer] = latter;
			height[latter]++;
		}else if(height[formmer]==height[latter] && formmer<latter) {
			parent[latter] = formmer;
			height[formmer]++;
		}else if(height[formmer]>height[latter]) {
			parent[latter] = formmer;
		}else if(height[formmer]<height[latter]) {
			parent[formmer] = latter;
		}
	}

	public static int same(int formmer, int latter) {
		while(parent[formmer]!=-1) {
			formmer = parent[formmer];
		}
		while(parent[latter]!=-1) {
			latter = parent[latter];
		}
		if(formmer==latter)
			return 1;
		else
			return 0;
	}

}