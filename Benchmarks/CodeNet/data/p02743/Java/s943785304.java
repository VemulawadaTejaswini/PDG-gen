import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
	    String input1 = scanner.next();
	    String input2 = scanner.next();
	    String input3 = scanner.next();
	    int a=Integer.parseInt(input1);
	    int b=Integer.parseInt(input2);
	    int c=Integer.parseInt(input3);
	    //System.out.println(h+"a"+n);
	    //a=h*n;

	    scanner.close();
	    if(Math.sqrt(a)*Math.sqrt(b)*2+a+b<c)
	    	System.out.println("Yes");
	    else
	    	System.out.println("No");
	}

}
