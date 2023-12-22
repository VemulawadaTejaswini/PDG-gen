import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int a,b,c;
    	int count=0;
    	a = sc.nextInt();
    	b = sc.nextInt();

    	System.out.println(a/b + " " + a%b + " " + (float)a/(float)b);
    }
}