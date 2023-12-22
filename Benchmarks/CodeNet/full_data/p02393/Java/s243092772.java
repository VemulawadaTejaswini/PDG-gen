import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String[] abc = sc.nextLine().split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);

		IntPointer pa = new IntPointer(a);
		IntPointer pb = new IntPointer(b);
		IntPointer pc = new IntPointer(c);

		sorting3(pa, pb, pc);

		System.out.println(pa.ast + " " + pb.ast + " " + pc.ast);
	}

	static void sorting3(IntPointer pa, IntPointer pb, IntPointer pc) {
		if (pa.ast > pb.ast) {
			int temp = pa.ast;
			pa.ast = pb.ast;
			pb.ast = temp;
		}
		if (pb.ast > pc.ast) {
			int temp = pb.ast;
			pb.ast = pc.ast;
			pc.ast = temp;
		}
		if (pa.ast > pb.ast) {
			int temp = pa.ast;
			pa.ast = pb.ast;
			pb.ast = temp;
		}

	}
}

class IntPointer {
	int ast; //value
	IntPointer(int n) {
		this.ast = n;
	}
}