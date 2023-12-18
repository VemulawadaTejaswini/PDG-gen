import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		Tree tree = new Tree(n);
		for (int i = 0; i < n - 1; i++) {
			tree.array_a(i, scan.nextInt(), scan.nextInt());
		}
		for(int i=0;i<q;i++){
			tree.report(scan.nextInt(), scan.nextInt());
		}
		tree.memorial(n);
	}

}
class Tree {
	int memory[];
	int a[];
	int b[];

	public Tree(int n) {
		memory = new int[n];
		a = new int[n];
		b = new int[n];
	}

	public void array_a(int i, int a, int b) {
		this.a[i]= a-1;
		this.b[i] = b-1;
	}
	public void report(int i, int sc) {
		memory[i-1] =memory[i-1]+ sc;
	}
	public void memorial(int n) {
		for(int i=0;i<n;i++){
			memory[b[i]]=memory[b[i]]+memory[a[i]];
			System.out.println(memory[i]);
		}
	}
}