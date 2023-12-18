import java.util.*;
import java.io.*;

class Solution
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(update(str));
	}
	static String update(String str)
	{
		char[] ch = str.toCharArray();
		for(int i = 0; i < 3; i++)
		{
			if(ch[i] == '1') ch[i] = '9';
			else ch[i] = '1';
		}
		return String.valueOf(ch);
	}


	TreeNode toTree(String str)
	{
		Stack<String> nums = new Stack<>(), ops = new Stack<>();
		Stack<TreeNode> nodes = new Stack<>();
		String v = "";
		for(char ch : str.toCharArray())
		{
			if(ch == '(')
			{
				nums.push(v);
				v = "";
			}
			else if(ch == ')')
			{
				if(!v.equals("")) nodes.push(new TreeNode(v));
				TreeNode right = nodes.pop(), left = nodes.pop(), root = new TreeNode(ops.pop());
				root.left = left;
				root.right = right;
				nodes.push(root);
				v = "";
			}
			else if('0' <= ch && ch <= '9')
			{
				v = v + ch;
			}
			else
			{	// operation
				nodes.push(new TreeNode(v)); 	// left side of operation
				ops.push("" + ch);	// operation
				v = "";
			}
		}
		return nodes.pop();
	}


	void print(TreeNode root)
	{
		List<String> list = new ArrayList<>();
		inOrder(root, list);
		System.out.println(list);
	}

	void inOrder(TreeNode root, List<String> list)
	{
		if(root == null) return;
		inOrder(root.left, list);
		list.add(root.str);
		inOrder(root.right, list);
	}
	
	class TreeNode
	{
		TreeNode left, right;
		String str;
		public TreeNode(String s)
		{
			str = s;
		}
	}	
}