import java.util.*;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int x,y = 0;
		char op;
		while(true){
			String[] line = in.nextLine().split(" ");
			x = Integer.parseInt(line[0]);	
			op  = line[1].charAt(0);	
			y = Integer.parseInt(line[2]);
			if (op == '?')break;
			
			switch(op){
			case '+':System.out.println(x+y);break;
			case '-':System.out.println(x-y);break;
			case '*':System.out.println(x*y);break;
			case '/':System.out.println(x/y);break;
			}
		}	
	}
}