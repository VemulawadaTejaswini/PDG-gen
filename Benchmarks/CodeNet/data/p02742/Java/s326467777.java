import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
	    String input1 = scanner.next();
	    String input2 = scanner.next();
	    long a;
	    int h=Integer.parseInt(input1);
	    int n=Integer.parseInt(input2);
	    //System.out.println(h+"a"+n);
	    //a=h*n;

	    scanner.close();
	    if(h%2==0) {
	    	a=h/2;
	    	a*=n;
	    }else if(n%2==0){
	    	a=n/2;
	    	a*=h;
	    }else {
	    	a=n/2;
	    	a*=h;
	    	a+=h/2;
	    	a++;
	    }
	    System.out.println(a);
	    	//System.out.println("YES");
	}

}
