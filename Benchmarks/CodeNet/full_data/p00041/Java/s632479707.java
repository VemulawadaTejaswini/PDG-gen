import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int[] data;
	
	private ArrayList<String> memo;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String line = sc.nextLine();
		while (line.equals("0 0 0 0") == false) {
			String[] nico = line.split(" ");
			data = new int[nico.length];
			
			memo = new ArrayList<String>();
			
			for (int i = 0; i < nico.length; i++) {
				data[i] = Integer.parseInt(nico[i]);
			}

			boolean flag = false;
			for (int i = 0; i < data.length; i++) {
				int i0 = i;
				int i1 = (i + 1) % 4;
				int i2 = (i + 2) % 4;
				int i3 = (i + 3) % 4;
				
				if (memo.contains("" + data[i0] + data[i1] + data[i2] + data[i3]) == false) {
					memo.add("" + data[i0] + data[i1] + data[i2] + data[i3]);
					flag = place(data[i0], data[i1], data[i2], data[i3]);
				}
				if (flag == true) break;
				
				if (memo.contains("" + data[i0] + data[i1] + data[i3] + data[i2]) == false) {
					memo.add("" + data[i0] + data[i1] + data[i3] + data[i2]);
					flag = place(data[i0], data[i1], data[i3], data[i2]);
				}
				if (flag == true) break;
				
				if (memo.contains("" + data[i0] + data[i2] + data[i1] + data[i3]) == false) {
					memo.add("" + data[i0] + data[i2] + data[i1] + data[i3]);
					flag = place(data[i0], data[i2], data[i1], data[i3]);
				}
				if (flag == true) break;
				
				if (memo.contains("" + data[i0] + data[i2] + data[i3] + data[i1]) == false) {
					memo.add("" + data[i0] + data[i2] + data[i3] + data[i1]);
					flag = place(data[i0], data[i2], data[i3], data[i1]);
				}
				if (flag == true) break;
				
				if (memo.contains("" + data[i0] + data[i3] + data[i1] + data[i2]) == false) {
					memo.add("" + data[i0] + data[i3] + data[i1] + data[i2]);
					flag = place(data[i0], data[i3], data[i1], data[i2]);
				}
				if (flag == true) break;
				
				if (memo.contains("" + data[i0] + data[i3] + data[i2] + data[i1]) == false) {
					memo.add("" + data[i0] + data[i3] + data[i2] + data[i1]);
					flag = place(data[i0], data[i3], data[i2], data[i1]);
				}
				if (flag == true) break;
			}
			if (flag == false) System.out.println("0");
			
			line = sc.nextLine();
		}
	}
	
	private boolean place(int i0, int i1, int i2, int i3) {
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					flag = calc(i0, i, i1, j, i2, k, i3);
					if (flag == true) break;
				}
				if (flag == true) break;
			}
			if (flag == true) break;
		}
		return flag;
	}
	
	private boolean calc(int i0, int o0, int i1, int o1, int i2, int o2, int i3) {
		char[] op = new char[3];
		op[0] = '+';
		op[1] = '-';
		op[2] = '*';

		if (operand(operand(operand(i0, o0, i1), o1, i2), o2, i3) == 10) {
			System.out.println("((" + i0 + op[o0] + i1 + ")" + op[o1] + i2 + ")" + op[o2] + i3);
			return true;
		}
		if (operand(operand(i0, o0, i1), o1, operand(i2, o2, i3)) == 10) {
			System.out.println("(" + i0 + op[o0] + i1 + ")" + op[o1] + "(" + i2 + op[o2] + i3 + ")");
			return true;
		}
		if (operand(operand(i0, o0, operand(i1, o1, i2)), o2, i3) == 10) {
			System.out.println("(" + i0 + op[o0] + "(" + i1 + op[o1] + i2 + "))" + op[o2] + i3);
			return true;
		}
		if (operand(i0, o0, operand(operand(i1, o1, i2), o2, i3)) == 10) {
			System.out.println("" + i0 + op[o0] + "((" + i1 + op[o1] + i2 + ")" + op[o2] + i3 + ")");
			return true;
		}
		if (operand(i0, o0, operand(i1, o1, operand(i2, o2, i3))) == 10) {
			System.out.println("" + i0 + op[o0] + "(" + i1 + op[o1] + "(" + i2 + op[o2] + i3 + "))");
			return true;
		}
		
		return false;
	}
	
	private int operand(int a, int o, int b) {
		int ans = 0;
		switch (o) {
		case 0:
			ans = a + b;
			break;
		case 1:
			ans = a - b;
			break;
		case 2:
			ans = a * b;
			break;
		}
		return ans;
	}
}