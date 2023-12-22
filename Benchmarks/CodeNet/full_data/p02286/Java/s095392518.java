import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_8_D
public class Main {
	Node root = null;
    	Node rightRotate(Node t) {
		Node s = t.left;
		t.left = s.right;
		s.right = t;
		return s;
	}
    	
    	Node leftRotate(Node t) {
    		Node s = t.right;
    		t.right = s.left;
    		s.left = t;
    		return s;
    	}
    	
	void preParse(Node node) {
		if (node == null) return;
		System.out.print(" " + node.key);
		preParse(node.left);
		preParse(node.right);
	}
	
	void inParse(Node node) {
		if (node == null) return;
		inParse(node.left);
		System.out.print(" " + node.key);
		inParse(node.right);
	}
	
	void postParse(Node node) {
		if (node == null) return;
		postParse(node.left);
		postParse(node.right);
		System.out.print(" " + node.key);
	}

    	Node delete(Node t, int key) {
    		if (t == null) return null;
    		if (key < t.key) t.left = delete(t.left, key);
    		else if (key > t.key) t.right = delete(t.right, key);
    		else return _delete(t, key);
    		return t;
    }
        		
    	Node _delete(Node t, int key) {
    		if (t.left == null && t.right == null) return null;
    		else if (t.left== null) t = leftRotate(t);
    		else if (t.right == null) t = rightRotate(t);
    		else {
    			if (t.left.priority > t.right.priority) t = rightRotate(t);
    			else t = leftRotate(t);
    		}
    		return delete(t, key);
    	}
	
	Node findCheck(Node node, int n) {
		if (node == null) return null;
		if (node.key == n) return node;
		else if (node.key > n) return findCheck(node.left, n);
		else return findCheck(node.right, n);
	}
	
	Node insert(Node t, int key, int priority) {
        	if (t == null) return new Node(key, priority);
        	if (key == t.key) return t;
        	if (key < t.key) {
        		t.left = insert(t.left, key, priority);
        		if (t.priority < t.left.priority) t = rightRotate(t);
        	} else {
        			t.right = insert(t.right, key, priority);
        			if (t.priority < t.right.priority) t = leftRotate(t);
        	}
        	return t;
	}
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			switch(str.charAt(0)) {
			case 'd':
				root = delete(root, Integer.parseInt(str.split(" ")[1]));
				break;
			case 'f':
				if (findCheck(root, Integer.parseInt(str.split(" ")[1])) != null) System.out.println("yes");
				else System.out.println("no");
				break;
			case 'i':
				int key = Integer.parseInt(str.split(" ")[1]);
				int priority = Integer.parseInt(str.split(" ")[2]);
				root = insert(root, key, priority);
				break;
			case 'p':
				inParse(root);
				System.out.println();
				preParse(root);
				System.out.println();
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

class Node {
	int key;
	int priority;
	Node parent = null;
	Node left = null;
	Node right = null;
	Node(int key, int priority) {
		this.key = key;
		this.priority = priority;
	}
}
