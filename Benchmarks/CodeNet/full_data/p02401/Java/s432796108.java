import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> input = new ArrayList<String>();
    while (true) {
    	String s = sc.nextLine();
    	if (s.contains("?")) { break; }
    	input.add(s);
    }
    for (int i = 0; i < input.size(); i++) {
    	String[] ss = input.get(i).split(" ");
    	int a = Integer.parseInt(ss[0]);
    	String op = ss[1];
    	int b = Integer.parseInt(ss[2]);
    	switch (op) {
    		case "+":
    			System.out.println(a + b);
    			break;
    		case "-":
    			System.out.println(a - b);
    			break;
    		case "*":
    			System.out.println(a * b);
    			break;
    		case "/":
    			if (b == 0) { System.out.println("ゼロ除算"); }
    			else System.out.println(a / b);
    			break;
    	}
    }
  }
}
