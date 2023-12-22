import java.util.Scanner;
import java.util.InputMismatchException;
class Main
{
    public static void main(String[] args){
	int n=0;
	long s=0;
	try{
	    Scanner scan = new Scanner(System.in);
	    n = scan.nextInt();
	    s = 0;
	    for (int i=0; i<n; i++){
		s += scan.nextInt();
	    }
	}catch (InputMismatchException e){
	    System.out.println(e);
	}
	System.out.printf("%d\n", s/n);
    }
}