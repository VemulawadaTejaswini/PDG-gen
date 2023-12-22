import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int a = stdin.nextInt();
	int b = stdin.nextInt();
	int d = a/b;
	int r = a%b;
	double f = (double)a/(double)b;
	System.out.println(d+" "+r+" "+f);
    }
}