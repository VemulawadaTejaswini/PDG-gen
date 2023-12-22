import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int times;
		int length;
		int sum;
		String str;
		LinkedList<Node> child;
		int position;
		Node(int size,int position){
			this.position = position;
			child = new LinkedList<Main.Node>();
			this.times = size;
		}
		Node(int size, String code ,int position) {
			this.position = position;
			int np = position;
			child = new LinkedList<Main.Node>();
			times = size;
			int buffer_int = -1;
			this.length = 0;
			sum = 0;
			if (code.length() == 1) {
				this.length = 1;
				this.str = code;
			} else {
				for (int ptr = 0; ptr < code.length(); ptr++) {
					if(np > 1e7){
						break;
					}
					char ch = code.charAt(ptr);
					if (ch >= 'A' && ch <= 'Z') {
						Node c = new Node(Math.abs(buffer_int), ch + "" ,np);
						child.add(c);
						np += c.sum;
						buffer_int = -1;
					}
					if (ch >= '0' && ch <= '9') {
						if (buffer_int == -1) {
							buffer_int = ch - '0';
						} else {
							buffer_int *= 10;
							buffer_int += ch - '0';
						}
					}
					if (ch == '(') {
						int depth = 1;
						String str2 = "";
						for (;;) {
							ptr++;
							ch = code.charAt(ptr);
							if (ch == ')') {
								depth--;
								if(depth == 0) break;
							}
							if (ch == '(') {
								depth++;
							}
							str2 += ch;
						}
	//					System.out.println(" "+str2);
						Node c = new Node(1, str2 ,np);
						Node kakko = new Node(Math.abs(buffer_int),np);
						kakko.child.add(c);
						for (Node q : kakko.child) {
							if(kakko.length + np > 1e7){
								break;
							}							
							kakko.length += q.sum;
						}
						int hensuu1;
						for(hensuu1 = 0 ; hensuu1 < kakko.times;hensuu1++){
							kakko.sum += kakko.length ;
							if(np + kakko.sum > 1000000){
								break;
							}
						}
						kakko.times = hensuu1;
						this.child.add(kakko);
						np += kakko.length;
						buffer_int = -1;
					}
				}
			}
			for (Node q : child) {
				this.length += q.sum;
			}
			int hensuu1;
			for(hensuu1 = 0 ; hensuu1 < times;hensuu1++){
				this.sum += this.length ;
				if(position + this.sum > 1000000){
			//		System.out.println("ツ可ス1");
					break;
				}
			}
			this.times = hensuu1;
			return;
		}

		String getChar(int i) {
	//		System.out.println(i);
			if (this.sum <= i) {
				return "0";
			}
			
			int set = 0;
			int z = 0;
			for (Node q : child) {
				set += q.sum;
	//			System.out.println(" "+z+","+set);
				if (set > i) {
					return q.getChar((i - z)%q.length);
				}
				z = set;
			}
			return str;
		}
		
		void dump(){
			System.out.println(times);
			System.out.println(length);
			System.out.println(sum);
			System.out.println(str);
			
			for(Node q : child){
				q.dump();
			}
		}
		
		public String toString(){
			return "";			
		}
	}

	void run() {
		for (;;) {
			String in = sc.next();
			int n = sc.nextInt();
			if (in.equals("0") && n == 0) {
				break;
			}
			
			Node root = new Node(1, "("+in+")" ,0);
/*
			root.dump();
	/*/		
    		System.out.println(root.getChar(n));
//*/			
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}