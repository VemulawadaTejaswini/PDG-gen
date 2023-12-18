import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	long b = sc.nextLong();
	long n = sc.nextLong();
	
	long result=0;
	long max = 0;
	long f_axb;
	long f_xb;
	for(int x=0;x<=n;x++){
	    f_axb = (a*x) / b;
	    f_xb = x/b;
	    result = f_axb - a * f_xb;
	    if(result >= max) max = result;
	}
	System.out.print(max);
    }
}
