import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String args[]) {
		//変数の宣言
		int a[]=new int[100];
		int b[]=new int[100];
		String op[]=new String[100];
		int result=0;
		int i=1;
		//入力
		//System.out.print("Please input a op b:");
		sc = new Scanner(System.in);
		for(;;) {
		a[i]=sc.nextInt();
		op[i]=sc.next();
		b[i]=sc.nextInt();
		if(op[i].equals("?")) {
			break;
		}
		i++;
		}
	    //識別と出力
		i=1;
		for(;;) {
			if(op[i].equals("?")) {
				break;
			}
			if(op[i].equals("+")) {
	    		result=a[i]+b[i];
	    	}else if(op[i].equals("-")) {
	    		result=a[i]-b[i];
	    	}else if(op[i].equals("*")) {
	    		result=a[i]*b[i];
	    	}else if(op[i].equals("/")) {
	    		result=a[i]/b[i];
	    	}else {
	    		System.out.println();
	    	}
			i++;
			System.out.println(result);
			result=0;
		}
	}
}

