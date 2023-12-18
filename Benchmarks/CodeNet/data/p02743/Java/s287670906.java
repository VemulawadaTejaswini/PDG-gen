import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	double d =  c - a - b;
	if((d>0) && (d*d > 4*a*b))
	    System.out.print("Yes");
	else
	    System.out.print("No");
    }
}
