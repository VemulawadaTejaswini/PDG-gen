import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		long yono = 0;
		for(int i = 1 ; i <= n / 3 ; i++){
			yono += c(n - 2 * i - 1 , i - 1);
			yono %= (int)(Math.pow(10 , 9) + 7);
		}
		ou.println(yono);
		ou.flush();
	}
	public static int c(int a , int b){
		if(b == 0) return 1;
		else if(a == b) return 1;
		else return (c(a - 1 , b - 1) + c(a - 1 , b)) % (int)(Math.pow(10 , 9) + 7);
	}
}