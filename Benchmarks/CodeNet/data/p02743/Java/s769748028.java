import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	double ab = Math.sqrt(a) + Math.sqrt(b);
	double cc = Math.sqrt(c);
	if( ab<cc )
	    System.out.print("Yes");
	else
	    System.out.print("No");
    }
}
