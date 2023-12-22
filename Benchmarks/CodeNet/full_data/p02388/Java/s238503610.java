import java.util.Scanner;

class Main{
    static int cube(int x){
	return x*x*x;
    }
    public static void main(String args[]){
	int n;
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	System.out.println(cube(n));
    }
}