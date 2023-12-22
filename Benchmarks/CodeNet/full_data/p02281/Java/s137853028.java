import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
static tree[] t;
static StringBuilder sb =   new StringBuilder();
public static void main(String[] args) {
	int x,root = 0,h;
	int n = s.nextInt();
	t = new tree[n];
	int[] c = new int[n+1];

	for(int i = 0;i < n;i++) {
		x = s.nextInt();
		if(i == 0) {
			root = x;
		}
		t[x] = new tree(x);
		for(int j = 0;j < 2;j++) {
			h = s.nextInt();
			if(j == 0) {
				t[x].setl(h);
			}else {
				t[x].setr(h);
			}
			if(h == -1)h = n;
			c[h] = 1;
		}
	}
	for(int i = 0;i < n;i++) {
		if(c[i] != 1) root = i;
	}
	rk(root,-1);
	sb.append("Preorder\n");
	preorder(root);
	sb.append("\nInorder\n");
	inorder(root);
	sb.append("\nPostorder\n");
	postorder(root);
	System.out.println(sb.toString());
}

static void preorder(int n) {
	sb.append(" " + t[n].getnode());
	if(t[n].getl() != -1) preorder(t[n].getl());
	if(t[n].getr() != -1) preorder(t[n].getr());
}

static void inorder(int n) {
	if(t[n].l != -1) inorder(t[n].l);
	sb.append(" " + t[n].node);
	if(t[n].r != -1)inorder(t[n].r);
}

static void postorder(int n) {
	if(t[n].l != -1) postorder(t[n].l);
	if(t[n].r != -1) postorder(t[n].r);
	sb.append(" " + t[n].node);
}

static void rk(int n,int p) {
	t[n].p = p;
	if(t[n].d  == 0)return;
	if(t[n].l != -1) rk(t[n].l,n);
	if(t[n].r != -1) rk(t[n].r,n);
}
}

class tree{
	int node,p,n,i,l,r,d = 0;

	tree(int node){
		this.node = node;
	}

	int getnode() {
		return node;
	}

	void setl(int a) {
		l = a;
		if(l != -1) {
			d++;
		}
	}

	int getl() {
		return l;
	}

	void setr(int a) {
		r = a;
		if(r != -1) {
			d++;
		}
	}

	int getr() {
		return r;
	}

	void setp(int a) {
		p = a;
	}

	int getp() {
		return p;
	}

	int getd() {
		return d;
	}
}
