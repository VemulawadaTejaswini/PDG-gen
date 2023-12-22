import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			String n = sc.next();
			if(n.equals("#"))break;
			else calc(n);
			
		}
	}
	String line;
	public void calc(String n){
		this.line = n;
		EqNode tree = makeNode();
		boolean ans = true;
		for(int a = 0; a < 2; a++){
			for(int b = 0; b < 2; b++){
				for(int c = 0; c < 2; c++){
					for(int d = 0; d < 2; d++){
						for(int e = 0; e < 2; e++){
							for(int f = 0; f < 2; f++){
								for(int g = 0; g < 2; g++){
									for(int h = 0; h < 2; h++){
										for(int i = 0; i < 2; i++){
											for(int j = 0; j < 2; j++){
												for(int k = 0; k < 2; k++){
													int val = tree.eval(a, b, c, d, e, f, g, h, i, j, k);
													if(val == 0) {
														ans = false;
														break;
													}
												}
												if(!ans) break;
											}
											if(!ans) break;
										}
										if(!ans) break;
									}
									if(!ans) break;
								}
								if(!ans) break;
							}
							if(!ans) break;
						}
						if(!ans) break;
					}
					if(!ans) break;
				}
				if(!ans) break;
			}
			if(!ans) break;
		}
		if(ans) System.out.println("YES");
		else System.out.println("NO");
	}

	public EqNode makeNode(){
		Node n1 = makeNode2();
		String s = line.substring(0,1);
		line = line.substring(1);
		if(!s.equals("=")){
			return null;
		}
		Node n2 = makeNode2();
		return new EqNode(n1, n2);
	}
	public Node makeNode2(){
		String s = line.substring(0,1);
		line = line.substring(1);
		
		if(s.equals("T")) return new BoolNode(1);
		else if(s.equals("F")) return new BoolNode(0);
		else if(s.equals("a") || s.equals("b") || s.equals("c") || s.equals("d") || s.equals("e")
				|| s.equals("f") || s.equals("g") || s.equals("h") || s.equals("i") || s.equals("j") || s.equals("k")) 
			return new StringNode(s);
		else if(s.equals("-")){
			Node n = makeNode2();
			return new NotNode(n);
		}
		else if(s.equals("(")){
			Node n1 = makeNode2();
			String s2 = line.substring(0,1);
			line = line.substring(1);
			if(s2.equals("*")){
				Node n2 = makeNode2();
				String s4 = line.substring(0,1);
				line = line.substring(1);
				if(s4.equals(")")) return new AndNode(n1, n2);
			}
			else if(s2.equals("+")){
				Node n2 = makeNode2();
				String s4 = line.substring(0,1);
				line = line.substring(1);
				if(s4.equals(")")) return new OrNode(n1, n2);
			}
			else if(s2.equals("-")){
				String s3 = line.substring(0,1);
				line = line.substring(1);
				if(s3.equals(">")){
					Node n2 = makeNode2();
					String s4 = line.substring(0,1);
					line = line.substring(1);
					if(s4.equals(")")) return new ImpNode(n1, n2);
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

interface Node{
	int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k);
}
class EqNode implements Node{
	Node n1;
	Node n2;
	EqNode(Node n1, Node n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int t1 = n1.eval(a, b, c, d, e, f, g, h, i, j, k);
		int t2 = n2.eval(a, b, c, d, e, f, g, h, i, j, k);
		if(t1 == t2) return 1;
		else return 0;
	}
}

class BoolNode implements Node{
	int bool;
	BoolNode(int t){
		this.bool = t;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		return this.bool;
	}
}
class StringNode implements Node{
	String s;
	StringNode(String s){
		this.s = s;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		if(s.equals("a")) return a;
		else if(s.equals("b")) return b;
		else if(s.equals("c")) return c;
		else if(s.equals("d")) return d;
		else if(s.equals("e")) return e;
		else if(s.equals("f")) return f;
		else if(s.equals("g")) return g;
		else if(s.equals("h")) return h;
		else if(s.equals("i")) return i;
		else if(s.equals("j")) return j;
		else return k;
	}
}
class NotNode implements Node{
	Node n;
	NotNode(Node n){
		this.n = n;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int t = n.eval(a, b, c, d, e, f, g, h, i, j, k);
		if(t == 0) return 1;
		else return 0;
	}
}
class AndNode implements Node{
	Node n1;
	Node n2;
	AndNode(Node n1, Node n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int t1 = n1.eval(a, b, c, d, e, f, g, h, i, j, k);
		int t2 = n2.eval(a, b, c, d, e, f, g, h, i, j, k);
		if(t1 == 1 && t2 == 1) return 1;
		else return 0;
	}
}
class OrNode implements Node{
	Node n1;
	Node n2;
	OrNode(Node n1, Node n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int t1 = n1.eval(a, b, c, d, e, f, g, h, i, j, k);
		int t2 = n2.eval(a, b, c, d, e, f, g, h, i, j, k);
		if(t1 == 0 && t2 == 0) return 0;
		else return 1;
	}
}
class ImpNode implements Node{
	Node n1;
	Node n2;
	ImpNode(Node n1, Node n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public int eval(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int t1 = n1.eval(a, b, c, d, e, f, g, h, i, j, k);
		int t2 = n2.eval(a, b, c, d, e, f, g, h, i, j, k);
		if(t1 == 1 & t2 == 0) return 0;
		else return 1;
	}
}