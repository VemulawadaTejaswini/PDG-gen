import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	int b = sc.nextInt();
	int n = sc.nextInt();
	
	int result=0;
	int max = 0;    
	for(int x=0;x<=n;x++){
	    int f_axb = a*x / b;
	    int f_xb = x/b;
	    result = f_axb - a * f_xb;
	    if(result > max) max = result;
	}
	System.out.print(max);
    }
}
