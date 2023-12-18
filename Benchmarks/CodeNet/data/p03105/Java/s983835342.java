import java.util.*;

// AGC 28-A
// https://beta.atcoder.jp/contests/agc028/tasks/agc028_a

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		if (B / A >= C) {
			out(C);
		} else {
			out(B / A);
		}
	}

    public static int sol(String s) {
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		char cc = s.charAt(i);
    		
    		if (cc == 'A') a++;
    		else if (cc == 'B') b += a;
    		else if (cc == 'C') c += b;
    	}
    	
    	return c;
    }
    
	public static int[] quicksort(int[] nums) {
		quicksortrec(nums, 0, nums.length - 1);
		return nums;
	}

	public static void quicksortrec(int[] nums, int low, int high) {
		if (low < high) {
			int index = partition(nums, low, high);
			quicksortrec(nums, low, index - 1);
			quicksortrec(nums, index + 1, high);
		}
	}

	public static int partition(int[] nums, int low, int high) { // [1,2], 0, 1
		// Pick the first element as pivot
		// int pivot = nums[low]; // 1
		//
		// int left = low + 1; // 2
		// int right = high; // 1
		//
		//
		// while (left <= right) { // This equal to is important to move right
		// cursor left cursor correct position
		// if (nums[left] <= pivot) {
		// left++;
		// continue;
		// }
		// if (pivot <= nums[right]) {
		// right--;
		// continue;
		// }
		// int tmp = nums[left];
		// nums[left] = nums[right];
		// nums[right] = tmp;
		// }
		// int tmp = nums[low];
		// nums[low] = nums[right];
		// nums[right] = tmp;
		//
		// return right;

		// Pick the last element as pivot
		int pivot = nums[high];

		int left = low;
		int right = high - 1;

		while (left <= right) {
			if (nums[left] <= pivot) {
				left++;
				continue;
			}
			if (pivot <= nums[right]) {
				right--;
				continue;
			}
			int tmp = nums[left];
			nums[left] = nums[right];
			nums[right] = tmp;
		}
		int tmp = nums[high];
		nums[high] = nums[left];
		nums[left] = tmp;

		return left;
	}

	// Pivot is the first element
	public static int partitionFront(int[] nums, int low, int high) {
		int pivot = nums[low];

		int left = low + 1;

		while (left <= high) {
			// Increment left until it reaches the element greater than pivot
			while (left <= high && nums[left] <= pivot)
				left++;
			while (left <= high && nums[high] >= pivot)
				high--;

			if (left < high) {
				int tmp = nums[left];
				nums[left] = nums[high];
				nums[high] = tmp;
			}
		}
		int tmp = nums[low];
		nums[low] = nums[high];
		nums[high] = tmp;

		return high;
	}

	// Pivot is the last element
	public static int partitionBack(int[] nums, int low, int high) {
		int pivot = nums[high];

		int right = high - 1;

		while (low <= right) {
			// Increment low until it is greater than pivot
			while (low <= right && nums[low] <= pivot)
				low++;
			// Decrement right until it is less than pivot
			while (low <= right && nums[right] >= pivot)
				right--;

			if (low < right) {
				int tmp = nums[low];
				nums[low] = nums[right];
				nums[right] = tmp;
			}
		}

		int tmp = nums[low];
		nums[low] = nums[high];
		nums[high] = tmp;

		return low;
	}

	public static void customOutput(Node head) {
	}

	public static void out(Object o) {
		System.out.println(o);
	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void printNumArray(int[] nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d%s", nums[i], i != nums.length - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printDoubleArray(double[] nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%f%s", nums[i], i != nums.length - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printDoubleList(List<List<Integer>> nums) {
		for (int i = 0; i < nums.size(); i++) {
			printNumList(nums.get(i));
		}
	}

	public static void printNumList(List<Integer> nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.size(); i++) {
			System.out.printf("%d%s", nums.get(i), i != nums.size() - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printStringList(List<String> list) {
		System.out.printf("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s%s", list.get(i), i != list.size() - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printNumListOfNumList(List<List<Integer>> num) {
		for (int i = 0; i < num.size(); i++) {
			printNumList(num.get(i));
		}
	}

	public static void printNum2DArray(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.printf("%2d ", map[i][j]);
			}
			System.out.println();
		}
	}

	public static void printListNode(ListNode node) {
		boolean first = true;
		while (node != null) {
			if (!first) {
				print("->");
			}
			print(node.val);
			node = node.next;
			first = false;
		}
	}

	public static void printStringSet(Set<String> set) {
		for (String s : set) {
			out(s);
		}
	}

	/**
	 * Receives an integer and print in numBits from the right
	 * 
	 * @param n
	 * @param numBits
	 */
	public static void printBinary(int n, int numBitsFromRight) {
		String s = "";
		for (int i = numBitsFromRight - 1; i >= 0; i--) {
			s += (n & (1 << i)) > 0 ? "1" : "0";
		}
		out(s);
	}

	// Taken from
	// https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class CustomClass {
	String to;
	double dist;

	public CustomClass(String to, double dist) {
		this.to = to;
		this.dist = dist;
	}
}

class TreeDrawer {
	public static String treeNodeToString(TreeNode root) {
		if (root == null) {
			return "[]";
		}

		String output = "";
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (node == null) {
				output += "null, ";
				continue;
			}

			output += String.valueOf(node.val) + ", ";
			nodeQueue.add(node.left);
			nodeQueue.add(node.right);
		}
		return "[" + output.substring(0, output.length() - 2) + "]";
	}

	public static TreeNode stringToTreeNode(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return null;
		}

		String[] parts = input.split(",");
		String item = parts[0];
		TreeNode root = new TreeNode(Integer.parseInt(item));
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);

		int index = 1;
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int leftNumber = Integer.parseInt(item);
				node.left = new TreeNode(leftNumber);
				nodeQueue.add(node.left);
			}

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int rightNumber = Integer.parseInt(item);
				node.right = new TreeNode(rightNumber);
				nodeQueue.add(node.right);
			}
		}
		return root;
	}

	public static void prettyPrintTree(TreeNode node, String prefix, boolean isLeft) {
		if (node == null) {
			System.out.println("Empty tree");
			return;
		}

		if (node.right != null) {
			prettyPrintTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
		}

		System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);

		if (node.left != null) {
			prettyPrintTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
		}
	}

	public static void draw(TreeNode node) {
		prettyPrintTree(node, "", true);
	}
}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Node {
	public int val;
	public Node next;
	public Node random;

	public Node() {
	}

	public Node(int _val, Node _next, Node _random) {
		val = _val;
		next = _next;
		random = _random;
	}
};
