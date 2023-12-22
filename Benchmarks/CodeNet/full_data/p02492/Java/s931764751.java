import java.io.*;
import java.util.*;

class  Calculation {
	int add(int a, int b) {
		return a + b;
	}		
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int ddd(int a, int b) {
		return a / b;
	}
}

class Main {
	String op;
	int a,b;
	
	public void start() {
		while(true) {
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String str = input.readLine();
				String array[] = str.split(" ");
				a  = Integer.parseInt(array[0]);	
				b  = Integer.parseInt(array[2]);
				op = array[1];
			} catch(IOException e) {
				e.printStackTrace();
			}
		
			Calculation cal1 = new Calculation();
			Calculation cal2 = new Calculation();
			Calculation cal3 = new Calculation();
			Calculation cal4 = new Calculation();
			
			if      (op.equals("?")) { System.exit(0); }
			else if	(op.equals("+")) { System.out.println(cal1.add(a, b)); }
			else if (op.equals("-")) { System.out.println(cal2.sub(a, b)); }
			else if (op.equals("*")) { System.out.println(cal3.mul(a, b)); }
			else if (op.equals("/")) { System.out.println(cal4.ddd(a, b)); }
			}
		}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	
	}
}