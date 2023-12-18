import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int k = scan.nextInt();
	    scan.close();
	    for(int i=a;i<=b;i++) {
	    	if(i<a+k || b-k<i)System.out.println(i);
	    }
	}

}