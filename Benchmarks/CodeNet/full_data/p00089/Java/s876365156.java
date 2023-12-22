import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int[] pre = new int[0];
		for (; sc.hasNextLine();) {
			String buffer = sc.nextLine();
			String[] num = buffer.split(",");
			int[] in = new int[num.length];
			for (int i = 0; i < num.length; i++) {
				in[i] = Integer.valueOf(num[i]);
			}
			if (num.length > pre.length) {
				if (pre.length != 0) {
					in[0] += pre[0];
					for (int i = 1; i < num.length; i++) {
						if (i == pre.length) {
							in[i] += pre[i - 1];
						} else {
							in[i] += Math.max(pre[i - 1], pre[i]);
						}
					}
				}
			} else {
				for (int i = 0; i < num.length; i++) {
					in[i] += Math.max(pre[i + 1], pre[i]);
				}
				if(in.length == 1){
					pre = in;
					break;
				}
			}
			pre = in;
		}
		System.out.println(pre[0]);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}