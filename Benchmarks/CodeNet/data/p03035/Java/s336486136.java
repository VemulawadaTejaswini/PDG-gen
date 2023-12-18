import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    Scanner stdIn = new Scanner(System.in);
	    
	    int r = stdIn.nextInt();
	    int D = stdIn.nextInt();
	    
	    int []a = new int [11];
	    a[0] = stdIn.nextInt();
	    
	    for (int i = 0 ; i < 10; i++) {
	    	a[i+1] = r * a[i] - D;
	    System.out.println(a[i + 1]);
	    
	    
	    }
		

	}

}