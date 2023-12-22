import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static class BinNode {
		public BinNode left = null;
		public BinNode right = null;
	}
	
	public static BinNode intersect(BinNode n1, BinNode n2) {
		if(n1 == null || n2 == null)
			return null;
		BinNode new1 = new BinNode();
		new1.left = intersect(n1.left, n2.left);
		new1.right = intersect(n1.right, n2.right);
		return new1;
	}
	public static BinNode union(BinNode n1, BinNode n2) {
		if(n1 == null && n2 == null)
			return null;
		BinNode new1 = new BinNode();
		BinNode n1left = (n1 == null)? null: n1.left;
		BinNode n1right = (n1 == null)? null: n1.right;
		BinNode n2left = (n2 == null)? null: n2.left;
		BinNode n2right = (n2 == null)? null: n2.right;
		new1.left = union(n1left, n2left);
		new1.right = union(n1right, n2right);
		return new1;
	}
	
	public static String to_string(BinNode root) {
		if(root == null)
			return "";
		return "(" + to_string(root.left) + "," + to_string(root.right) + ")";
	}
	
	public static BinNode parse(char[] buf) {
		return parse(buf, 0, buf.length-1);
	}
	private static BinNode parse(char[] buf, int start, int end) {
		int idx = findNode(buf, start, end);
		//System.out.printf("start=%d end=%d, idx=%d\n", start, end, idx);
		if(idx < 0) return null;
		BinNode node = new BinNode();
		node.left = parse(buf, start+1, idx-1);
		node.right = parse(buf, idx+1, end-1);
		return node;
	}
	private static int findNode(char[] buf, int start, int end) {
		int level = 0;
		for(int i = start; i <= end; i++) {
			if(buf[i] == ',' && level == 1)
				return i;
			if(buf[i] == '(')
				level++;
			else if(buf[i] == ')')
				level--;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = null;
		while((l = br.readLine()) != null) {
			String cols[] = l.split(" ");
			BinNode n1 = parse(cols[1].toCharArray());
			BinNode n2 = parse(cols[2].toCharArray());
			BinNode ans = null;
			if(cols[0].equals("i") ) {
				ans = intersect(n1, n2);
			}
			else if(cols[0].equals("u")){
				ans = union(n1, n2);
			}
			System.out.printf("%s\n", to_string(ans));
		}
		/**
		String l1 = "((,(,)),)";
		String l2 = "((,),(,))";
		BinNode node1 = parse(l1.toCharArray());
		BinNode node2 = parse(l2.toCharArray());
		BinNode output1 = intersect(node1, node2);
		BinNode output2 = union(node1, node2);
		
		System.out.printf("intersect= %s\n", to_string(output1));
		System.out.printf("union= %s\n", to_string(output2));
		*/
	}

}