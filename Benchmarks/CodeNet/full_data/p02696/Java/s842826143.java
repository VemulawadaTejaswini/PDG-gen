import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	long b = sc.nextLong();
	long n = sc.nextLong();
	
	long result=0;
	long max = 0;
	max = (a*n)/b;
	System.out.print(max);
    }
}
