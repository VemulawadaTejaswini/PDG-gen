import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        while (true) {
	    String line = sc.nextLine();
	    if (line.equals(".")) break;
	    char[] stack = new char[line.length()];
	    int index = 0;
	    boolean flag = true;
	    for (int i = 0; i < line.length(); i++) {
		if (line.charAt(i) == '(') {
		    stack[index++] = '(';
		} else if (line.charAt(i) == '[') {
		    stack[index++] = '[';
		}
		if (line.charAt(i) == ')') {
		    if (index == 0) {
			flag = false;
			break;
		    }
		    if (stack[index-1] == '(') {
			index--;
		    } else {
			flag = false;
			break;
		    }
		} else if (line.charAt(i) == ']') {
		    if (index == 0) {
			flag = false;
			break;
		    }
		    if (stack[index-1] == '[') {
			index--;
		    } else {
			flag = false;
			break;
		    }
		}
	    }
	    if (index != 0) flag = false;
	    if (flag) {
		System.out.println("yes");
	    } else {
		System.out.println("no");
	    }
	}
		    
	sc.close();
    }
}
