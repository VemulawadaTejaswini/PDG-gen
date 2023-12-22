import java.lang.Math.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if(Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2)) System.out.println("YES");
	    else System.out.println("NO");
	}
    }
}